package com.routine.portal.routinePortal.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginRequest {

    private String employeeId;
    private String password;

}
