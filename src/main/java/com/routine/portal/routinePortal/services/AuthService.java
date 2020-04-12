package com.routine.portal.routinePortal.services;


import com.routine.portal.routinePortal.client.UaaClientService;
import com.routine.portal.routinePortal.client.dto.request.LoginRequest;
import com.routine.portal.routinePortal.client.dto.request.SignUpRequest;
import com.routine.portal.routinePortal.client.dto.response.AccessTokenResponse;
import com.routine.portal.routinePortal.client.dto.response.LoggedUserDetailsResponse;
import com.routine.portal.routinePortal.config.AuthUtil;
import com.routine.portal.routinePortal.domain.model.User;
import com.routine.portal.routinePortal.domain.repository.UserRepository;
import com.routine.portal.routinePortal.dto.request.UserLoginRequest;
import com.routine.portal.routinePortal.dto.request.UserSignUpRequest;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import com.routine.portal.routinePortal.exception.ForbiddenException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthService {

    private final UaaClientService uaaClientService;
    private final UserRepository userRepository;
    private final AuthUtil authUtil;


    public ResponseEntity<IdentityResponse> login(UserLoginRequest userLoginRequest, HttpServletResponse response) {
        String roleName = "";
        Optional<AccessTokenResponse> accessTokenResponseOptional = uaaClientService.login(
                new LoginRequest(userLoginRequest.getEmployeeId(), userLoginRequest.getPassword()));
        if (!accessTokenResponseOptional.isPresent()) {

        }

        activeLoggedUser("Bearer " + accessTokenResponseOptional.get().getToken());
        IdentityResponse identityResponse = new IdentityResponse(accessTokenResponseOptional.get().getToken());
        return new ResponseEntity(identityResponse, HttpStatus.OK);
    }

    public ResponseEntity<IdentityResponse> signUp(UserSignUpRequest userSignUpRequest) {

        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setUsername(userSignUpRequest.getEmployeeId());
        signUpRequest.setRole(userSignUpRequest.getRole());
        signUpRequest.setPassword(userSignUpRequest.getPassword());

        Optional<String> userId = uaaClientService.signUp(signUpRequest);
        if (!userId.isPresent()) {
            throw new RuntimeException("Registration Failed");
        }
        User user = new User();
        user.setDepartment(userSignUpRequest.getDepartment());
        user.setDesignation(userSignUpRequest.getDesignation());
        user.setEmail(userSignUpRequest.getEmail());
        user.setFacultyType(userSignUpRequest.getFacultyType());
        user.setFullName(userSignUpRequest.getFullName());
        user.setEmployeeId(userSignUpRequest.getEmployeeId());
        user.setPhoneNumber(userSignUpRequest.getPhoneNumber());
        user.setTeacherInitial(userSignUpRequest.getTeacherInitial());
        user.setUserId(userId.get());
        userRepository.save(user);

        return new ResponseEntity(new IdentityResponse(userId.get()), HttpStatus.CREATED);
    }

    public boolean activeLoggedUser(String token) {

        String header = token;
        Optional<LoggedUserDetailsResponse> loggedUserDetailsResponseOptional = uaaClientService.getLoggedUserDetails(header);

        if (!loggedUserDetailsResponseOptional.isPresent()) {
            authUtil.setLogged(false);
            throw new ForbiddenException("Header Not Found");
        }
        LoggedUserDetailsResponse loggedUserDetailsResponse = loggedUserDetailsResponseOptional.get();

        authUtil.setEmployeeId(loggedUserDetailsResponse.getUserName());
        authUtil.setAuthenticate(loggedUserDetailsResponse.getIsAuthenticated());
        authUtil.setRoles(loggedUserDetailsResponse.getUserRole());
        authUtil.setLogged(true);
        return true;
    }

    public boolean pink(HttpServletResponse response) {

        String header = response.getHeader("Authorization");
        Optional<LoggedUserDetailsResponse> loggedUserDetailsResponseOptional = uaaClientService.getLoggedUserDetails(header);

        if (!loggedUserDetailsResponseOptional.isPresent()) {
            return false;
        }
        LoggedUserDetailsResponse loggedUserDetailsResponse = loggedUserDetailsResponseOptional.get();

        authUtil.setEmployeeId(loggedUserDetailsResponse.getUserName());
        authUtil.setAuthenticate(loggedUserDetailsResponse.getIsAuthenticated());
        authUtil.setRoles(loggedUserDetailsResponse.getUserRole());
        authUtil.setLogged(true);
        return true;
    }

    public String getTest() {
        return authUtil.getEmployeeId();
    }

    public ResponseEntity<String> logout() {
        if (!authUtil.isLogged()) {
            throw new ForbiddenException("User is not logged");
        }
        authUtil.setLogged(false);
        return new ResponseEntity("Logout Successfully", HttpStatus.OK);
    }
}
