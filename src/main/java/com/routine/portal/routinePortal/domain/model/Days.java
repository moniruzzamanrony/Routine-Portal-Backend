package com.routine.portal.routinePortal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Days {

    @Id
    @Column(name = "day_id")
    private String dayId;

    @OneToMany(targetEntity = ClassDetailsSaturday.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "f_k", referencedColumnName = "day_id")
    private List<ClassDetailsSaturday> saturday;

    @OneToMany(targetEntity = ClassDetailsSunday.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "f_k", referencedColumnName = "day_id")
    private List<ClassDetailsSunday> sunday;

    @OneToMany(targetEntity = ClassDetailsMonday.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "f_k", referencedColumnName = "day_id")
    private List<ClassDetailsMonday> monday;

    @OneToMany(targetEntity = ClassDetailsTuesday.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "f_k", referencedColumnName = "day_id")
    private List<ClassDetailsTuesday> tuesday;

    @OneToMany(targetEntity = ClassDetailsWednesday.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "f_k", referencedColumnName = "day_id")
    private List<ClassDetailsWednesday> wednesday;

    @OneToMany(targetEntity = ClassDetailsThursday.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "f_k", referencedColumnName = "day_id")
    private List<ClassDetailsThursday> thursday;


}
