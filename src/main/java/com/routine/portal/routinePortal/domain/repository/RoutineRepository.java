package com.routine.portal.routinePortal.domain.repository;

import com.routine.portal.routinePortal.domain.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, String> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE class_details_saturday sunday SET course_code='joyaaaa',end_time='roni',faculty_member='roni',faculty_member_employee_id='roni',label='roni',room_no='roni',section='roni',start_time='roni' WHERE class_details_id='0091beb5-0b31-4531-a6c6-cd6b7e289158';", nativeQuery = true)
    int updateMyClass(String classDetailsId, String roomNo, String startTime, String endTime, String label, String courseCode, String section, String facultyMember, String dayName);

}
