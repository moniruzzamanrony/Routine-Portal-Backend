package com.routine.portal.routinePortal.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IdentityResponse {
    private String accessToken;
}
