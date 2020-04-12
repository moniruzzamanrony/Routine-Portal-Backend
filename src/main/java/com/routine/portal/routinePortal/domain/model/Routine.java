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
public class Routine {

    @Id
    @Column(name = "routine_id")
    private String routineId;

    private String routineVersion;

    private String routinePublisherId;

    private String routineSession;

    private String routinePublishDate;

    private String routineEffectiveDate;

    @OneToMany(targetEntity = Days.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "f_k", referencedColumnName = "routine_id")
    private List<Days> days;

}
