package com.routine.portal.routinePortal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DaysRequest {

    private List<SaturdayRequest> saturday;

    private List<SundayRequest> sunday;

    private List<MondayRequest> monday;

    private List<TuesdayRequest> tuesday;

    private List<WednesdayRequest> wednesday;

    private List<ThursdayRequest> thursday;


}
