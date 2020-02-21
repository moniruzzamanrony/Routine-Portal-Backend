package com.routine.portal.routinePortal.client;


import com.routine.portal.routinePortal.client.dto.request.LoginRequest;
import com.routine.portal.routinePortal.client.dto.response.AccessTokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
@FeignClient(value = "UaaClientService", url = "localhost:20223/public/")
public interface UaaClientService {

    @PostMapping("signin")
    Optional<AccessTokenResponse> login(LoginRequest loginRequest);


}
