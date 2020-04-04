package com.routine.portal.routinePortal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class SundayRequest {

    private String roomNo;

    private String time;

    private String label;

    private String courseCode;

    private String section;

    private String facultyMember;
}
