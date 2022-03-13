package com.greatlearning.model;

import java.util.Random;

public class EmployeeCredentialService {
    public char[] generatePassword(){
        char password[] = new char[8];
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String num = "1234567890";
        String special = "!@#$%^&*()";
        String permu = upperCase+lowerCase+num+special;
        Random random = new Random();
        for(int i=0;i<8;i++){
            password[i] = permu.charAt(random.nextInt(permu.length()));
        }
        return password;
    }
    public String generateEmailAddress(String firstName, String lastName){
        Employee employee = new Employee("Abhishek","Ranjan");
        EmployeeCredentialService deptName = new EmployeeCredentialService();
        return(employee.getFirstName()+employee.getLastName()+"@"+Department.getDepartment()+".greatlearning.com");
    }
    public void showCredentials(String email, char[] generatedPassword){
        System.out.println("Dear Abhishek your generated credentials are as follows");
        System.out.println("Email ---->"+email);
        System.out.println("Password ---->"+generatedPassword);
    }
}
