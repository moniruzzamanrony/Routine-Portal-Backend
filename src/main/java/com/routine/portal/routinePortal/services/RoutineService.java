package com.routine.portal.routinePortal.services;

import com.routine.portal.routinePortal.config.AuthUtil;
import com.routine.portal.routinePortal.domain.model.*;
import com.routine.portal.routinePortal.domain.repository.RoutineRepository;
import com.routine.portal.routinePortal.dto.request.CreateRoutineRequest;
import com.routine.portal.routinePortal.dto.request.RoutineUpdateRequest;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import com.routine.portal.routinePortal.exception.ForbiddenException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoutineService {
    private final RoutineRepository routineRepository;
    private final AuthUtil authUtil;

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

    public ResponseEntity<Routine> getRoutine() {

        List<Routine> routineList = routineRepository.findAll();
        return new ResponseEntity(routineList.get(0), HttpStatus.OK);
    }

    public ResponseEntity<List<Routine>> getRoutineList() {

        List<Routine> routineList = routineRepository.findAll();
        return new ResponseEntity(routineList, HttpStatus.OK);
    }

    public ResponseEntity<String> update(RoutineUpdateRequest routineUpdateRequest) {

        if (routineRepository.updateMyClass(routineUpdateRequest.getClassDetailsId(), routineUpdateRequest.getRoomNo(),
                routineUpdateRequest.getStartTime(), routineUpdateRequest.getEndTime(), routineUpdateRequest.getLabel(),
                routineUpdateRequest.getCourseCode(), routineUpdateRequest.getSection(),
                routineUpdateRequest.getFacultyMember(), routineUpdateRequest.getDayName()) == 1) {

        }

        return new ResponseEntity("ffffff", HttpStatus.OK);
    }
}

