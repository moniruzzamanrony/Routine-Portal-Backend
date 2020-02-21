package com.routine.portal.routinePortal.controller;

import com.routine.portal.routinePortal.dto.request.UserLoginRequest;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import com.routine.portal.routinePortal.services.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("public/")
public class LoginController {
    private final LoginService loginService;

    @PostMapping("login")
    public ResponseEntity<IdentityResponse> login(@RequestBody UserLoginRequest userLoginRequest)
    {
        return loginService.login(userLoginRequest);
    }
}

