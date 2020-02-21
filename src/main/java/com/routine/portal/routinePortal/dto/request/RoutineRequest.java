package com.routine.portal.routinePortal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class RoutineRequest {


    private List<SaturdayRequest> saturdayList;

    private List<SundayRequest> sundayList;

    private List<MondayRequest> mondayList;

    private List<TuesdayRequest> tuesdayList;

    private List<WednesdayRequest> wednesdayList;

    private List<ThursdayRequest> thursdayList;
}
