package com.routine.portal.routinePortal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@AllArgsConstructor
@Setter
@Getter
public class ThursdayRequest {

    @Id
    private String routineId;

    private String time;

    private String roomNo;

    private String fm;

    private String label;

    private String courseCode;

    private String section;
}
