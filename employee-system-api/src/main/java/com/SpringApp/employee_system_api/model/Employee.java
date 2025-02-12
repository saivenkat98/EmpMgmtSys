package com.SpringApp.employee_system_api.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

    public String printshit(){
        return "wassup";
    }
}