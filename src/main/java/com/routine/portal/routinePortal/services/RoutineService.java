package com.routine.portal.routinePortal.services;

import com.routine.portal.routinePortal.domain.model.*;
import com.routine.portal.routinePortal.domain.repository.RoutineRepository;
import com.routine.portal.routinePortal.dto.response.IdentityResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoutineService {

    private final RoutineRepository routineRepository;


    public ResponseEntity<IdentityResponse> create(String routineVersionCode) {
        ArrayList<String> timeList = new ArrayList<>();
        timeList.add("8:30-10:00");
        timeList.add("10:00-11:30");
        timeList.add("11:30-01:00");
        timeList.add("01:00-02:30");
        timeList.add("02:30-04:00");
        timeList.add("4:00-05:30");

        String routineId = UUID.randomUUID().toString();
        List<Saturday> saturdayList = new ArrayList<>();
        for (String time : timeList) {
            Saturday saturday = new Saturday();
            saturday.setRoutineId(routineId);
            saturday.setTime(time);
            saturday.setRoomNo("Not Occupied");
            saturday.setFm("Not Occupied");
            saturday.setLabel("Not Occupied");
            saturday.setCourseCode("Not Occupied");
            saturday.setSection("Not Occupied");
            saturdayList.add(saturday);

        }

        List<Sunday> sundayList = new ArrayList<>();
        for (String time : timeList) {
            Sunday sunday = new Sunday();
            sunday.setRoutineId(routineId);
            sunday.setTime(time);
            sunday.setRoomNo("Not Occupied");
            sunday.setFm("Not Occupied");
            sunday.setLabel("Not Occupied");
            sunday.setCourseCode("Not Occupied");
            sunday.setSection("Not Occupied");
            sundayList.add(sunday);

        }

        List<Monday> mondayList = new ArrayList<>();
        for (String time : timeList) {
            Monday monday = new Monday();

            monday.setRoutineId(routineId);
            monday.setTime(time);
            monday.setRoomNo("Not Occupied");
            monday.setFm("Not Occupied");
            monday.setLabel("Not Occupied");
            monday.setCourseCode("Not Occupied");
            monday.setSection("Not Occupied");
            mondayList.add(monday);

        }

        List<Tuesday> tuesdayList = new ArrayList<>();
        for (String time : timeList) {
            Tuesday tuesday = new Tuesday();
            tuesday.setRoutineId(routineId);
            tuesday.setTime(time);
            tuesday.setRoomNo("Not Occupied");
            tuesday.setFm("Not Occupied");
            tuesday.setLabel("Not Occupied");
            tuesday.setCourseCode("Not Occupied");
            tuesday.setSection("Not Occupied");
            tuesdayList.add(tuesday);

        }

        List<Thursday> thursdayList = new ArrayList<>();
        for (String time : timeList) {
            Thursday thursday = new Thursday();
            thursday.setRoutineId(routineId);
            thursday.setTime(time);
            thursday.setRoomNo("Not Occupied");
            thursday.setFm("Not Occupied");
            thursday.setLabel("Not Occupied");
            thursday.setCourseCode("Not Occupied");
            thursday.setSection("Not Occupied");
            thursdayList.add(thursday);

        }

        List<Wednesday> wednesdayList = new ArrayList<>();
        for (String time : timeList) {
            Wednesday wednesday = new Wednesday();
            wednesday.setRoutineId(routineId);
            wednesday.setTime(time);
            wednesday.setRoomNo("Not Occupied");
            wednesday.setFm("Not Occupied");
            wednesday.setLabel("Not Occupied");
            wednesday.setCourseCode("Not Occupied");
            wednesday.setSection("Not Occupied");
            wednesdayList.add(wednesday);
        }

        Routine routine = new Routine();
        routine.setRoutineId(routineId);
        routine.setRoutineVersion("v-" + routineVersionCode);
        routine.setSaturday(saturdayList);
        routine.setSunday(sundayList);
        //routine.setMonday(mondayList);
        routine.setTuesday(tuesdayList);
        routine.setThursday(thursdayList);
        routine.setWednesday(wednesdayList);

        routineRepository.save(routine);
        return new ResponseEntity(new IdentityResponse(routineId), HttpStatus.CREATED);

    }
}
