package com.routine.portal.routinePortal.domain.repository;

import com.routine.portal.routinePortal.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
