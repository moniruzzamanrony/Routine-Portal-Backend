package com.routine.portal.routinePortal.client;


import com.routine.portal.routinePortal.client.dto.request.LoginRequest;
import com.routine.portal.routinePortal.client.dto.request.SignUpRequest;
import com.routine.portal.routinePortal.client.dto.response.AccessTokenResponse;
import com.routine.portal.routinePortal.client.dto.response.LoggedUserDetailsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Optional;

@Service
@FeignClient(value = "UaaClientService", url = "localhost:20230/")
public interface UaaClientService {

    @PostMapping("public/signin")
    Optional<AccessTokenResponse> login(LoginRequest loginRequest);

    @PostMapping("public/signup")
    Optional<String> signUp(SignUpRequest signUpRequest);

    @GetMapping("user-details")
    Optional<LoggedUserDetailsResponse> getLoggedUserDetails(@RequestHeader("Authorization") String authorizationHeader);



}
