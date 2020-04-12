package com.routine.portal.routinePortal.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String fullName;

    private String teacherInitial;

    private String designation;

    private String department;

    private String employeeId;

    private String facultyType;

    private String phoneNumber;

    private String email;

}
