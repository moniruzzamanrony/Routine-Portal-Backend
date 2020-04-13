package com.routine.portal.routinePortal.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClassDetailsSaturday {
    @Id
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
