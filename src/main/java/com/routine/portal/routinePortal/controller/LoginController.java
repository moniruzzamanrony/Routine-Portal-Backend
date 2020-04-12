package com.routine.portal.routinePortal.controller;

import com.routine.portal.routinePortal.dto.request.UserLoginRequest;
import com.routine.portal.routinePortal.dto.request.UserSignUpRequest;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import com.routine.portal.routinePortal.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
public class LoginController {
    private final AuthService authService;

    @PostMapping("login")
    public ResponseEntity<IdentityResponse> login(@RequestBody UserLoginRequest userLoginRequest, HttpServletResponse response) {
        return authService.login(userLoginRequest, response);
    }

    @PostMapping("sign-up")
    public ResponseEntity<IdentityResponse> signUp(@RequestBody UserSignUpRequest userSignUpRequest) {
        return authService.signUp(userSignUpRequest);
    }

    @GetMapping("user-details")
    public String getLoggedUserDetails() {
        return authService.getTest();
    }

    @PutMapping("logout")
    public ResponseEntity<String> logout() {
        return authService.logout();
    }
}

