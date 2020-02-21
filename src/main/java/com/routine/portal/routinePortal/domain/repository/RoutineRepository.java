package com.routine.portal.routinePortal.domain.repository;

import com.routine.portal.routinePortal.domain.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineRepository extends JpaRepository<Routine, String> {
}
