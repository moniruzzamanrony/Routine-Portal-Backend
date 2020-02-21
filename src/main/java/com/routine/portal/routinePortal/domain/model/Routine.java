package com.routine.portal.routinePortal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Routine {

    @NotNull
    @Id
    private String routineId;

    private String routineVersion;

    @ElementCollection
    private List<Saturday> saturday;

    @ElementCollection
    private List<Sunday> sunday;

    @ElementCollection
    private List<Monday> monday;

    @ElementCollection
    private List<Tuesday> tuesday;

    @ElementCollection
    private List<Wednesday> wednesday;

    @ElementCollection
    private List<Thursday> thursday;


}
