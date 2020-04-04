package com.routine.portal.routinePortal.services;


import com.routine.portal.routinePortal.client.UaaClientService;
import com.routine.portal.routinePortal.client.dto.request.LoginRequest;
import com.routine.portal.routinePortal.client.dto.response.AccessTokenResponse;
import com.routine.portal.routinePortal.dto.request.UserLoginRequest;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginService {

    private final UaaClientService uaaClientService;

    public ResponseEntity<IdentityResponse> login(UserLoginRequest userLoginRequest) {

        Optional<AccessTokenResponse> accessTokenResponseOptional = uaaClientService.login(
                new LoginRequest(userLoginRequest.getEmployeeId(), userLoginRequest.getPassword()));
        if (!accessTokenResponseOptional.isPresent()) {

        }
        IdentityResponse identityResponse = new IdentityResponse(accessTokenResponseOptional.get().getToken());
        return new ResponseEntity(identityResponse, HttpStatus.OK);
    }
}
