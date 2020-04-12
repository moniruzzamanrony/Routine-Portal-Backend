package com.routine.portal.routinePortal.client.dto.request;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {

    private String username;

    private Set<String> role;

    private String password;

}
