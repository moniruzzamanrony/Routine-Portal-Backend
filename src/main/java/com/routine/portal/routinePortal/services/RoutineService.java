package com.routine.portal.routinePortal.services;

import com.routine.portal.routinePortal.config.AuthUtil;
import com.routine.portal.routinePortal.domain.model.*;
import com.routine.portal.routinePortal.domain.repository.RoutineRepository;
import com.routine.portal.routinePortal.domain.repository.UserRepository;
import com.routine.portal.routinePortal.dto.request.ClassUpdateRequest;
import com.routine.portal.routinePortal.dto.request.CreateRoutineRequest;
import com.routine.portal.routinePortal.dto.response.ClassDetailsResponse;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import com.routine.portal.routinePortal.dto.response.UserResponse;
import com.routine.portal.routinePortal.exception.ForbiddenException;
import com.routine.portal.routinePortal.exception.ResourseNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@AllArgsConstructor
public class RoutineService {
    private final RoutineRepository routineRepository;
    private final UserRepository userRepository;
    private final AuthUtil authUtil;
    private final AuthService authService;

    public ResponseEntity<IdentityResponse> create(CreateRoutineRequest createRoutineRequest) {
        if (!authUtil.isLogged()) {
            throw new ForbiddenException("User is't logged");
        }

        String routineId = UUID.randomUUID().toString();
        String daysId = UUID.randomUUID().toString();
        ArrayList<ClassDetailsSaturday> saturdayList = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (ClassDetailsSaturday classDetailsSaturday : createRoutineRequest.getDays().get(0).getSaturday()) {
            ClassDetailsSaturday saturdayClassDetails = new ClassDetailsSaturday();
            saturdayClassDetails.setClassDetailsId(UUID.randomUUID().toString());
            saturdayClassDetails.setCourseCode(classDetailsSaturday.getCourseCode());
            saturdayClassDetails.setFacultyMember(classDetailsSaturday.getFacultyMember());
            saturdayClassDetails.setLabel(classDetailsSaturday.getLabel());
            saturdayClassDetails.setRoomNo(classDetailsSaturday.getRoomNo());
            saturdayClassDetails.setSection(classDetailsSaturday.getSection());
            saturdayClassDetails.setStartTime(classDetailsSaturday.getStartTime());
            saturdayClassDetails.setEndTime(classDetailsSaturday.getEndTime());
            saturdayClassDetails.setFacultyMemberEmployeeId(classDetailsSaturday.getFacultyMemberEmployeeId());
            saturdayList.add(saturdayClassDetails);
        }


        ArrayList<ClassDetailsSunday> sundayList = new ArrayList<>();
        for (ClassDetailsSunday classDetailsSunday : createRoutineRequest.getDays().get(0).getSunday()) {
            ClassDetailsSunday sundayClassDetails = new ClassDetailsSunday();
            sundayClassDetails.setClassDetailsId(UUID.randomUUID().toString());
            sundayClassDetails.setCourseCode(classDetailsSunday.getCourseCode());
            sundayClassDetails.setFacultyMember(classDetailsSunday.getFacultyMember());
            sundayClassDetails.setLabel(classDetailsSunday.getLabel());
            sundayClassDetails.setRoomNo(classDetailsSunday.getRoomNo());
            sundayClassDetails.setSection(classDetailsSunday.getSection());
            sundayClassDetails.setStartTime(classDetailsSunday.getStartTime());
            sundayClassDetails.setEndTime(classDetailsSunday.getEndTime());
            sundayClassDetails.setFacultyMemberEmployeeId(classDetailsSunday.getFacultyMemberEmployeeId());
            sundayList.add(sundayClassDetails);
        }


        ArrayList<ClassDetailsMonday> mondayList = new ArrayList<>();
        for (ClassDetailsMonday classDetailsMonday : createRoutineRequest.getDays().get(0).getMonday()) {
            ClassDetailsMonday detailsMonday = new ClassDetailsMonday();
            detailsMonday.setClassDetailsId(UUID.randomUUID().toString());
            detailsMonday.setCourseCode(classDetailsMonday.getCourseCode());
            detailsMonday.setFacultyMember(classDetailsMonday.getFacultyMember());
            detailsMonday.setLabel(classDetailsMonday.getLabel());
            detailsMonday.setRoomNo(classDetailsMonday.getRoomNo());
            detailsMonday.setSection(classDetailsMonday.getSection());
            detailsMonday.setStartTime(classDetailsMonday.getStartTime());
            detailsMonday.setEndTime(classDetailsMonday.getEndTime());
            detailsMonday.setFacultyMemberEmployeeId(classDetailsMonday.getFacultyMemberEmployeeId());
            mondayList.add(detailsMonday);
        }

        ArrayList<ClassDetailsTuesday> tuesdayArrayList = new ArrayList<>();
        for (ClassDetailsTuesday classDetailsTuesday : createRoutineRequest.getDays().get(0).getTuesday()) {
            ClassDetailsTuesday detailsTuesday = new ClassDetailsTuesday();
            detailsTuesday.setClassDetailsId(UUID.randomUUID().toString());
            detailsTuesday.setCourseCode(classDetailsTuesday.getCourseCode());
            detailsTuesday.setFacultyMember(classDetailsTuesday.getFacultyMember());
            detailsTuesday.setLabel(classDetailsTuesday.getLabel());
            detailsTuesday.setRoomNo(classDetailsTuesday.getRoomNo());
            detailsTuesday.setSection(classDetailsTuesday.getSection());
            detailsTuesday.setStartTime(classDetailsTuesday.getStartTime());
            detailsTuesday.setEndTime(classDetailsTuesday.getEndTime());
            detailsTuesday.setFacultyMemberEmployeeId(classDetailsTuesday.getFacultyMemberEmployeeId());
            tuesdayArrayList.add(detailsTuesday);
        }

        ArrayList<ClassDetailsWednesday> wednesdaysList = new ArrayList<>();
        for (ClassDetailsWednesday detailsWednesday : createRoutineRequest.getDays().get(0).getWednesday()) {
            ClassDetailsWednesday classDetailsWednesday = new ClassDetailsWednesday();
            classDetailsWednesday.setClassDetailsId(UUID.randomUUID().toString());
            classDetailsWednesday.setCourseCode(detailsWednesday.getCourseCode());
            classDetailsWednesday.setFacultyMember(detailsWednesday.getFacultyMember());
            classDetailsWednesday.setLabel(detailsWednesday.getLabel());
            classDetailsWednesday.setRoomNo(detailsWednesday.getRoomNo());
            classDetailsWednesday.setSection(detailsWednesday.getSection());
            classDetailsWednesday.setStartTime(detailsWednesday.getStartTime());
            classDetailsWednesday.setEndTime(detailsWednesday.getEndTime());
            classDetailsWednesday.setFacultyMemberEmployeeId(detailsWednesday.getFacultyMemberEmployeeId());
            wednesdaysList.add(classDetailsWednesday);
        }

        ArrayList<ClassDetailsThursday> thursdayArrayList = new ArrayList<>();
        for (ClassDetailsThursday detailsThursday : createRoutineRequest.getDays().get(0).getThursday()) {
            ClassDetailsThursday classDetailsThursday = new ClassDetailsThursday();
            classDetailsThursday.setClassDetailsId(UUID.randomUUID().toString());
            classDetailsThursday.setCourseCode(detailsThursday.getCourseCode());
            classDetailsThursday.setFacultyMember(detailsThursday.getFacultyMember());
            classDetailsThursday.setLabel(detailsThursday.getLabel());
            classDetailsThursday.setRoomNo(detailsThursday.getRoomNo());
            classDetailsThursday.setSection(detailsThursday.getSection());
            classDetailsThursday.setStartTime(detailsThursday.getStartTime());
            classDetailsThursday.setEndTime(detailsThursday.getEndTime());
            classDetailsThursday.setFacultyMemberEmployeeId(detailsThursday.getFacultyMemberEmployeeId());
            thursdayArrayList.add(classDetailsThursday);
        }


        ArrayList<Days> daysArrayList = new ArrayList<>();
        Days days = new Days();
        days.setDayId(daysId);
        days.setSaturday(saturdayList);
        days.setSunday(sundayList);
        days.setMonday(mondayList);
        days.setTuesday(tuesdayArrayList);
        days.setWednesday(wednesdaysList);
        days.setThursday(thursdayArrayList);
        daysArrayList.add(days);

        Routine routine = new Routine();
        routine.setRoutineId(routineId);
        routine.setRoutineEffectiveDate(createRoutineRequest.getRoutineEffectiveDate());
        routine.setRoutinePublishDate(df.format(new Date()));
        routine.setRoutinePublisherId(authUtil.getEmployeeId());
        routine.setRoutineVersion(createRoutineRequest.getRoutineVersion());
        routine.setRoutineSession(createRoutineRequest.getRoutineSession());
        routine.setDays(daysArrayList);

        routineRepository.save(routine);

        return new ResponseEntity(new IdentityResponse(routineId), HttpStatus.CREATED);
    }

    /*
     *
     * Get Lat Routine
     * */
    public ResponseEntity<Routine> getRoutine() {

        if (!authUtil.isLogged()) {
            throw new ForbiddenException("User is't logged");
        }
        List<Routine> routineList = routineRepository.findAll();

        return new ResponseEntity(routineList.get(0), HttpStatus.OK);
    }

    public ResponseEntity<List<Routine>> getRoutineList() {

        if (!authUtil.isLogged()) {
            throw new ForbiddenException("User is't logged");
        }
        List<Routine> routineList = routineRepository.findAll();

        return new ResponseEntity(routineList, HttpStatus.OK);
    }

    public ResponseEntity<String> updateMyClassDetails(ClassUpdateRequest routineUpdateRequest) {

        if (!authUtil.isLogged()) {
            throw new ForbiddenException("User is't logged");
        }

        if (routineUpdateRequest.getDayName().equals("saturday")) {
            if (routineRepository.updateSaturdayMyClass(routineUpdateRequest.getCourseCode(), routineUpdateRequest.getEndTime(), routineUpdateRequest.getFacultyMember(),
                    authUtil.getEmployeeId(), routineUpdateRequest.getLabel(), routineUpdateRequest.getRoomNo(),
                    routineUpdateRequest.getSection(), routineUpdateRequest.getStartTime(), routineUpdateRequest.getClassDetailsId()) == 1) {

            }
        } else if (routineUpdateRequest.getDayName().equals("sunday")) {
            if (routineRepository.updateSundayMyClass(routineUpdateRequest.getCourseCode(), routineUpdateRequest.getEndTime(), routineUpdateRequest.getFacultyMember(),
                    authUtil.getEmployeeId(), routineUpdateRequest.getLabel(), routineUpdateRequest.getRoomNo(),
                    routineUpdateRequest.getSection(), routineUpdateRequest.getStartTime(), routineUpdateRequest.getClassDetailsId()) == 1) {

            }

        } else if (routineUpdateRequest.getDayName().equals("monday")) {
            if (routineRepository.updateMondayMyClass(routineUpdateRequest.getCourseCode(), routineUpdateRequest.getEndTime(), routineUpdateRequest.getFacultyMember(),
                    authUtil.getEmployeeId(), routineUpdateRequest.getLabel(), routineUpdateRequest.getRoomNo(),
                    routineUpdateRequest.getSection(), routineUpdateRequest.getStartTime(), routineUpdateRequest.getClassDetailsId()) == 1) {

            }
        } else if (routineUpdateRequest.getDayName().equals("tuesday")) {
            if (routineRepository.updateTuesdayMyClass(routineUpdateRequest.getCourseCode(), routineUpdateRequest.getEndTime(), routineUpdateRequest.getFacultyMember(),
                    authUtil.getEmployeeId(), routineUpdateRequest.getLabel(), routineUpdateRequest.getRoomNo(),
                    routineUpdateRequest.getSection(), routineUpdateRequest.getStartTime(), routineUpdateRequest.getClassDetailsId()) == 1) {

            }
        } else if (routineUpdateRequest.getDayName().equals("wednesday")) {
            if (routineRepository.updateWednesdayMyClass(routineUpdateRequest.getCourseCode(), routineUpdateRequest.getEndTime(), routineUpdateRequest.getFacultyMember(),
                    authUtil.getEmployeeId(), routineUpdateRequest.getLabel(), routineUpdateRequest.getRoomNo(),
                    routineUpdateRequest.getSection(), routineUpdateRequest.getStartTime(), routineUpdateRequest.getClassDetailsId()) == 1) {

            }
        } else if (routineUpdateRequest.getDayName().equals("thursday")) {
            if (routineRepository.updateThursdayMyClass(routineUpdateRequest.getCourseCode(), routineUpdateRequest.getEndTime(), routineUpdateRequest.getFacultyMember(),
                    authUtil.getEmployeeId(), routineUpdateRequest.getLabel(), routineUpdateRequest.getRoomNo(),
                    routineUpdateRequest.getSection(), routineUpdateRequest.getStartTime(), routineUpdateRequest.getClassDetailsId()) == 1) {

            }
        } else {
            return new ResponseEntity("Update Error", HttpStatus.BAD_REQUEST);
        }


        return new ResponseEntity("Update Successful", HttpStatus.OK);
    }


    /*
     * Get User List
     * */
    public ResponseEntity<UserResponse> getUserDetails(HttpServletRequest httpServletRequest) {

        if (!authService.pink(httpServletRequest)) {
            throw new ForbiddenException("User not Logged");
        }
        Optional<User> userOptional = userRepository.findByEmployeeId(authUtil.getEmployeeId());
        if (!userOptional.isPresent()) {
            throw new ResourseNotFoundException("User Not Found");
        }
        UserResponse userResponse = new UserResponse();
        userResponse.setDepartment(userOptional.get().getDepartment());
        userResponse.setDesignation(userOptional.get().getDesignation());
        userResponse.setEmail(userOptional.get().getEmail());
        userResponse.setEmployeeId(userOptional.get().getEmployeeId());
        userResponse.setFacultyType(userOptional.get().getFacultyType());
        userResponse.setFullName(userOptional.get().getFullName());
        userResponse.setPhoneNumber(userOptional.get().getPhoneNumber());
        userResponse.setTeacherInitial(userOptional.get().getTeacherInitial());

        return new ResponseEntity(userResponse, HttpStatus.OK);

    }

    /*
     * Get Faculty List
     * */

    public ResponseEntity<List<User>> getFacultyList(HttpServletRequest httpServletRequest) {
        if (!authService.pink(httpServletRequest)) {
            throw new ForbiddenException("User not Logged");
        }
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }

    /*
     * Get Class Details By Class Id
     * */

    public ResponseEntity<ClassDetailsResponse> getClassDetailsByClassId(HttpServletRequest httpServletRequest, String classId, String day) {

        if (day.equals("saturday")) {
            List<Routine> routineList = routineRepository.findAll();
            Routine routine = routineList.get(0);
            List<ClassDetailsSaturday> daysList = routine.getDays().get(0).getSaturday();
            for (ClassDetailsSaturday classDetailsSunday : daysList) {
                System.out.println(day);
                if (classDetailsSunday.getClassDetailsId().equals(classId)) {
                    ClassDetailsResponse classDetailsResponse = new ClassDetailsResponse();

                    classDetailsResponse.setEndTime(classDetailsSunday.getEndTime());
                    classDetailsResponse.setStartTime(classDetailsSunday.getStartTime());
                    classDetailsResponse.setFacultyMember(classDetailsSunday.getFacultyMember());
                    classDetailsResponse.setFacultyMemberEmployeeId(classDetailsSunday.getFacultyMemberEmployeeId());
                    classDetailsResponse.setLabel(classDetailsSunday.getLabel());
                    classDetailsResponse.setRoomNo(classDetailsSunday.getRoomNo());
                    classDetailsResponse.setSection(classDetailsSunday.getSection());
                    classDetailsResponse.setCourseCode(classDetailsSunday.getCourseCode());

                    return new ResponseEntity(classDetailsResponse, HttpStatus.OK);
                }
            }
        } else if (day.equals("sunday")) {
            List<Routine> routineList = routineRepository.findAll();
            Routine routine = routineList.get(0);
            List<ClassDetailsSunday> daysList = routine.getDays().get(0).getSunday();
            for (ClassDetailsSunday classDetailsSunday : daysList) {
                System.out.println(classDetailsSunday.getClassDetailsId() + "====" + classId);
                System.out.println(classDetailsSunday.getCourseCode());
                if (classDetailsSunday.getClassDetailsId().equals(classId)) {
                    ClassDetailsResponse classDetailsResponse = new ClassDetailsResponse();

                    classDetailsResponse.setStartTime(classDetailsSunday.getStartTime());
                    classDetailsResponse.setEndTime(classDetailsSunday.getEndTime());
                    classDetailsResponse.setFacultyMember(classDetailsSunday.getFacultyMember());
                    classDetailsResponse.setFacultyMemberEmployeeId(classDetailsSunday.getFacultyMemberEmployeeId());
                    classDetailsResponse.setLabel(classDetailsSunday.getLabel());
                    classDetailsResponse.setRoomNo(classDetailsSunday.getRoomNo());
                    classDetailsResponse.setSection(classDetailsSunday.getSection());
                    classDetailsResponse.setCourseCode(classDetailsSunday.getCourseCode());

                    return new ResponseEntity(classDetailsResponse, HttpStatus.OK);
                }
            }
        } else if (day.equals("monday")) {
            List<Routine> routineList = routineRepository.findAll();
            Routine routine = routineList.get(0);
            List<ClassDetailsMonday> daysList = routine.getDays().get(0).getMonday();
            for (ClassDetailsMonday classDetailsSunday : daysList) {
                System.out.println(classDetailsSunday.getClassDetailsId() + "====" + classId);
                System.out.println(classDetailsSunday.getCourseCode());
                if (classDetailsSunday.getClassDetailsId().equals(classId)) {
                    ClassDetailsResponse classDetailsResponse = new ClassDetailsResponse();

                    classDetailsResponse.setStartTime(classDetailsSunday.getStartTime());
                    classDetailsResponse.setEndTime(classDetailsSunday.getEndTime());
                    classDetailsResponse.setFacultyMember(classDetailsSunday.getFacultyMember());
                    classDetailsResponse.setFacultyMemberEmployeeId(classDetailsSunday.getFacultyMemberEmployeeId());
                    classDetailsResponse.setLabel(classDetailsSunday.getLabel());
                    classDetailsResponse.setRoomNo(classDetailsSunday.getRoomNo());
                    classDetailsResponse.setSection(classDetailsSunday.getSection());
                    classDetailsResponse.setCourseCode(classDetailsSunday.getCourseCode());

                    return new ResponseEntity(classDetailsResponse, HttpStatus.OK);
                }
            }

        } else if (day.equals("tuesday")) {
            List<Routine> routineList = routineRepository.findAll();
            Routine routine = routineList.get(0);
            List<ClassDetailsTuesday> daysList = routine.getDays().get(0).getTuesday();
            for (ClassDetailsTuesday classDetailsSunday : daysList) {
                System.out.println(classDetailsSunday.getClassDetailsId() + "====" + classId);
                System.out.println(classDetailsSunday.getCourseCode());
                if (classDetailsSunday.getClassDetailsId().equals(classId)) {
                    ClassDetailsResponse classDetailsResponse = new ClassDetailsResponse();

                    classDetailsResponse.setStartTime(classDetailsSunday.getStartTime());
                    classDetailsResponse.setEndTime(classDetailsSunday.getEndTime());
                    classDetailsResponse.setFacultyMember(classDetailsSunday.getFacultyMember());
                    classDetailsResponse.setFacultyMemberEmployeeId(classDetailsSunday.getFacultyMemberEmployeeId());
                    classDetailsResponse.setLabel(classDetailsSunday.getLabel());
                    classDetailsResponse.setRoomNo(classDetailsSunday.getRoomNo());
                    classDetailsResponse.setSection(classDetailsSunday.getSection());
                    classDetailsResponse.setCourseCode(classDetailsSunday.getCourseCode());

                    return new ResponseEntity(classDetailsResponse, HttpStatus.OK);
                }
            }

        } else if (day.equals("wednesday")) {
            List<Routine> routineList = routineRepository.findAll();
            Routine routine = routineList.get(0);
            List<ClassDetailsWednesday> daysList = routine.getDays().get(0).getWednesday();
            for (ClassDetailsWednesday classDetailsSunday : daysList) {
                System.out.println(classDetailsSunday.getClassDetailsId() + "====" + classId);
                System.out.println(classDetailsSunday.getCourseCode());
                if (classDetailsSunday.getClassDetailsId().equals(classId)) {
                    ClassDetailsResponse classDetailsResponse = new ClassDetailsResponse();

                    classDetailsResponse.setStartTime(classDetailsSunday.getStartTime());
                    classDetailsResponse.setEndTime(classDetailsSunday.getEndTime());
                    classDetailsResponse.setFacultyMember(classDetailsSunday.getFacultyMember());
                    classDetailsResponse.setFacultyMemberEmployeeId(classDetailsSunday.getFacultyMemberEmployeeId());
                    classDetailsResponse.setLabel(classDetailsSunday.getLabel());
                    classDetailsResponse.setRoomNo(classDetailsSunday.getRoomNo());
                    classDetailsResponse.setSection(classDetailsSunday.getSection());
                    classDetailsResponse.setCourseCode(classDetailsSunday.getCourseCode());

                    return new ResponseEntity(classDetailsResponse, HttpStatus.OK);
                }
            }

        } else if (day.equals("thursday")) {
            List<Routine> routineList = routineRepository.findAll();
            Routine routine = routineList.get(0);
            List<ClassDetailsThursday> daysList = routine.getDays().get(0).getThursday();
            for (ClassDetailsThursday classDetailsSunday : daysList) {
                System.out.println(classDetailsSunday.getClassDetailsId() + "====" + classId);
                System.out.println(classDetailsSunday.getCourseCode());
                if (classDetailsSunday.getClassDetailsId().equals(classId)) {
                    ClassDetailsResponse classDetailsResponse = new ClassDetailsResponse();

                    classDetailsResponse.setStartTime(classDetailsSunday.getStartTime());
                    classDetailsResponse.setEndTime(classDetailsSunday.getEndTime());
                    classDetailsResponse.setFacultyMember(classDetailsSunday.getFacultyMember());
                    classDetailsResponse.setFacultyMemberEmployeeId(classDetailsSunday.getFacultyMemberEmployeeId());
                    classDetailsResponse.setLabel(classDetailsSunday.getLabel());
                    classDetailsResponse.setRoomNo(classDetailsSunday.getRoomNo());
                    classDetailsResponse.setSection(classDetailsSunday.getSection());
                    classDetailsResponse.setCourseCode(classDetailsSunday.getCourseCode());

                    return new ResponseEntity(classDetailsResponse, HttpStatus.OK);
                }
            }

        } else {
            return new ResponseEntity("Class Not Found By Id", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity("Class Not Found By Id", HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> deleteRoutine(HttpServletRequest servletRequest) {

        routineRepository.deleteAll();
        return new ResponseEntity("delete successfull", HttpStatus.NO_CONTENT);
    }
}

