package com.routine.portal.routinePortal.domain.repository;

import com.routine.portal.routinePortal.domain.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, String> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE class_details_saturday sunday SET course_code= ?,end_time= ?,faculty_member= ?,faculty_member_employee_id= ?,label= ?,room_no= ?,section= ?,start_time = ? WHERE class_details_id= ?;", nativeQuery = true)
    int updateSaturdayMyClass(@Param("courseCode") String courseCode,
                              @Param("endTime") String endTime,
                              @Param("facultyMember") String facultyMember,
                              @Param("employeeId") String employeeId,
                              @Param("label") String label,
                              @Param("roomNo") String roomNo,
                              @Param("section") String section,
                              @Param("startTime") String startTime,
                              @Param("classDetailsId") String classDetailsId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE class_details_sunday sunday SET course_code= ?,end_time= ?,faculty_member= ?,faculty_member_employee_id= ?,label= ?,room_no= ?,section= ?,start_time = ? WHERE class_details_id= ?;", nativeQuery = true)
    int updateSundayMyClass(@Param("courseCode") String courseCode,
                            @Param("endTime") String endTime,
                            @Param("facultyMember") String facultyMember,
                            @Param("employeeId") String employeeId,
                            @Param("label") String label,
                            @Param("roomNo") String roomNo,
                            @Param("section") String section,
                            @Param("startTime") String startTime,
                            @Param("classDetailsId") String classDetailsId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE class_details_monday sunday SET course_code= ?,end_time= ?,faculty_member= ?,faculty_member_employee_id= ?,label= ?,room_no= ?,section= ?,start_time = ? WHERE class_details_id= ?;", nativeQuery = true)
    int updateMondayMyClass(@Param("courseCode") String courseCode,
                            @Param("endTime") String endTime,
                            @Param("facultyMember") String facultyMember,
                            @Param("employeeId") String employeeId,
                            @Param("label") String label,
                            @Param("roomNo") String roomNo,
                            @Param("section") String section,
                            @Param("startTime") String startTime,
                            @Param("classDetailsId") String classDetailsId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE class_details_tuesday sunday SET course_code= ?,end_time= ?,faculty_member= ?,faculty_member_employee_id= ?,label= ?,room_no= ?,section= ?,start_time = ? WHERE class_details_id= ?;", nativeQuery = true)
    int updateTuesdayMyClass(@Param("courseCode") String courseCode,
                             @Param("endTime") String endTime,
                             @Param("facultyMember") String facultyMember,
                             @Param("employeeId") String employeeId,
                             @Param("label") String label,
                             @Param("roomNo") String roomNo,
                             @Param("section") String section,
                             @Param("startTime") String startTime,
                             @Param("classDetailsId") String classDetailsId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE class_details_wednesday sunday SET course_code= ?,end_time= ?,faculty_member= ?,faculty_member_employee_id= ?,label= ?,room_no= ?,section= ?,start_time = ? WHERE class_details_id= ?;", nativeQuery = true)
    int updateWednesdayMyClass(@Param("courseCode") String courseCode,
                               @Param("endTime") String endTime,
                               @Param("facultyMember") String facultyMember,
                               @Param("employeeId") String employeeId,
                               @Param("label") String label,
                               @Param("roomNo") String roomNo,
                               @Param("section") String section,
                               @Param("startTime") String startTime,
                               @Param("classDetailsId") String classDetailsId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE class_details_thursday sunday SET course_code= ?,end_time= ?,faculty_member= ?,faculty_member_employee_id= ?,label= ?,room_no= ?,section= ?,start_time = ? WHERE class_details_id= ?;", nativeQuery = true)
    int updateThursdayMyClass(@Param("courseCode") String courseCode,
                              @Param("endTime") String endTime,
                              @Param("facultyMember") String facultyMember,
                              @Param("employeeId") String employeeId,
                              @Param("label") String label,
                              @Param("roomNo") String roomNo,
                              @Param("section") String section,
                              @Param("startTime") String startTime,
                              @Param("classDetailsId") String classDetailsId);

}
