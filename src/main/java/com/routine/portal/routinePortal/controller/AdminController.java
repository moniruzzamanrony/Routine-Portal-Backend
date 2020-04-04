package com.routine.portal.routinePortal.controller;


import com.routine.portal.routinePortal.domain.model.Routine;
import com.routine.portal.routinePortal.dto.request.CreateRoutineRequest;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import com.routine.portal.routinePortal.services.RoutineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("admin/")
public class AdminController {

    private final RoutineService routineService;

    @PostMapping("routine/create")
    public ResponseEntity<IdentityResponse> getDashboard(@RequestBody CreateRoutineRequest createRoutineRequest) {
        return routineService.create(createRoutineRequest);
    }

    @GetMapping("routine/create")
    public ResponseEntity<List<Routine>> getRoutine() {
        return routineService.getRoutine();
    }

}
