package com.routine.portal.routinePortal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Thursday {

    @Id
    private String routineId;

    private String time;

    private String roomNo;

    private String fm;

    private String label;

    private String courseCode;

    private String section;
}
