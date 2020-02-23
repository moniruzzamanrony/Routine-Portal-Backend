package com.routine.portal.routinePortal.client;


import com.routine.portal.routinePortal.client.dto.request.LoginRequest;
import com.routine.portal.routinePortal.client.dto.response.AccessTokenResponse;
import com.routine.portal.routinePortal.client.dto.response.LoggedUserDetailsResponse;
import feign.Headers;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
@FeignClient(value = "UaaClientService", url = "localhost:20230/")
public interface UaaClientService {

    @PostMapping("public/signin")
    Optional<AccessTokenResponse> login(LoginRequest loginRequest);

    @GetMapping("loggedUser")
    @Headers("Authorization: Bearer {authorizationHeader}")
    Optional<LoggedUserDetailsResponse> getLoggedUserDetails(@Param("authorizationHeader") String authorizationHeader);



}
