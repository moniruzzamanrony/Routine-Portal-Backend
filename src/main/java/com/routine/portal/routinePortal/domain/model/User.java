package com.routine.portal.routinePortal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String userId;

    private String fullName;

    private String teacherInitial;

    private String designation;

    private String department;

    private String employeeId;

    private String facultyType;

    private String phoneNumber;

    private String email;

    private String joinDate;


}
