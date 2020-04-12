package com.routine.portal.routinePortal.config;

import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Setter
public class AuthUtil {

    private String employeeId;

    private List<String> roles;

    private boolean isAuthenticate;

    private boolean isLogged;

    public boolean isLogged() {
        return isLogged;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getRole() {
        String role = "";
        for (String roleValue : roles) {
            role = roleValue;
        }
        return role;
    }

    public List<String> getRoles() {
        return roles;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }
}
