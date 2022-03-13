package com.greatlearning.model;

public class Employee {
    private String firstName;
    private String lastName;
    public Employee(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        String fName = firstName;
        return fName;
    }
    public String getLastName(){
        String lName = lastName;
        return lName;
    }
}
