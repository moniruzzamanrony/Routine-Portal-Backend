package com.routine.portal.routinePortal.controller;


import com.routine.portal.routinePortal.dto.request.ClassUpdateRequest;
import com.routine.portal.routinePortal.dto.response.ClassDetailsResponse;
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
    public ResponseEntity<String> updateMyRoutine(@RequestBody ClassUpdateRequest routineUpdateRequest) {
        return routineService.updateMyClassDetails(routineUpdateRequest);
    }

    @GetMapping("details")
    public ResponseEntity<UserResponse> getUserDetails(HttpServletRequest httpServletRequest) {
        return routineService.getUserDetails(httpServletRequest);
    }

    @GetMapping("{day}/class/{classId}")
    public ResponseEntity<ClassDetailsResponse> getClassDetailsByClassId(HttpServletRequest httpServletRequest, @PathVariable("day") String day, @PathVariable("classId") String classId) {
        return routineService.getClassDetailsByClassId(httpServletRequest, classId, day);
    }
}
