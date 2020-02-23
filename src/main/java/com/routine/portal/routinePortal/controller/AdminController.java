package com.routine.portal.routinePortal.controller;


import com.routine.portal.routinePortal.services.RoutineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@AllArgsConstructor
@RequestMapping("admin/")
public class AdminController {

    private final RoutineService routineService;

    @PostMapping("routine/create/{version}")
    public ResponseEntity<String> getDashboard(HttpServletRequest request, @PathVariable String version) {


        return routineService.create(version, request);
    }

}
