package com.routine.portal.routinePortal.controller;


import com.routine.portal.routinePortal.dto.request.RoutineUpdateRequest;
import com.routine.portal.routinePortal.dto.response.UserResponse;
import com.routine.portal.routinePortal.services.RoutineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("my/")
public class UserSelfController {

    private final RoutineService routineService;

    @PutMapping("routine")
    public ResponseEntity<String> updateMyRoutine(@RequestBody RoutineUpdateRequest routineUpdateRequest) {
        return routineService.updateMyClassDetails(routineUpdateRequest);
    }

    @GetMapping("details")
    public ResponseEntity<UserResponse> getUserDetails(HttpServletRequest httpServletRequest) {
        return routineService.getUserDetails(httpServletRequest);
    }
}
