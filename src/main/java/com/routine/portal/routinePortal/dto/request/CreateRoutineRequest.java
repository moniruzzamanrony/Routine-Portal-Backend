package com.routine.portal.routinePortal.dto.request;

import com.routine.portal.routinePortal.domain.model.Days;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CreateRoutineRequest {

    private String routineVersion;

    private String routineSession;

    private String routineEffectiveDate;

    private List<Days> days;


}
