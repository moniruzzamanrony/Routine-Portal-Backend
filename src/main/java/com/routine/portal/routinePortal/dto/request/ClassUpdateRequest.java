package com.routine.portal.routinePortal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
public class ClassUpdateRequest {

    private String classDetailsId;

    private String roomNo;

    private String startTime;

    private String endTime;

    private String label;

    private String courseCode;

    private String section;

    private String facultyMember;

    private String dayName;
}
