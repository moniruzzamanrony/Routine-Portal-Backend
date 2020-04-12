package com.routine.portal.routinePortal.domain.repository;

import com.routine.portal.routinePortal.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


    Optional<User> findByEmployeeId(String employeeId);
}
