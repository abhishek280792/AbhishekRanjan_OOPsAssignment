package com.greatlearning.model;

public class Department {
    private String department;
    public static String departmentName;
    public Department(){};
    public Department(int department) {
        if(department==1){
            this.departmentName = "tech";
        }
        if(department==2){
            this.departmentName = "admin";
        }
        if(department==3){
            this.departmentName = "hr";
        }
        if(department==4){
            this.departmentName = "legal";
        }
    }

    public static String getDepartment() {
        return departmentName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
