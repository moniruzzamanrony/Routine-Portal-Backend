package com.routine.portal.routinePortal.controller;

import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import com.routine.portal.routinePortal.services.RoutineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RoutineController {
    private final RoutineService routineService;

    @PostMapping("public/create/routine/version/{routineVersionCode}")
    public ResponseEntity<IdentityResponse> createInitialRoutine(@PathVariable String routineVersionCode) {
        return routineService.create(routineVersionCode);
    }
}
