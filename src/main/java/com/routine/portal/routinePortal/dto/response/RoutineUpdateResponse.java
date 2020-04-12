package com.routine.portal.routinePortal.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoutineUpdateResponse {

    private String classDetailsId;

    private String roomNo;

    private String startTime;

    private String endTime;

    private String label;

    private String courseCode;

    private String section;

    private String facultyMember;

    private String facultyMemberEmployeeId;


}
