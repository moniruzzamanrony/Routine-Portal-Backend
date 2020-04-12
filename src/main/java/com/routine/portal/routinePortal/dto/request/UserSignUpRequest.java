package com.routine.portal.routinePortal.dto.request;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpRequest {

    private String fullName;

    private String teacherInitial;

    private String designation;

    private String department;

    private String employeeId;

    private String facultyType;

    private String phoneNumber;

    private String email;

    private Set<String> role;

    private String password;

}
