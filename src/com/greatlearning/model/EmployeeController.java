package com.greatlearning.model;

import java.util.Scanner;

public class EmployeeController {
    public static  void main(String[] args){
        EmployeeCredentialService service = new EmployeeCredentialService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please enter below options");
        System.out.println("\n1. Technical \n2. Admin \n3.Human Resource \n4. Legal");
        int option = scanner.nextInt();
        Department department = new Department(option);
        switch(option){
            case 1:
                String email = service.generateEmailAddress("Abhishek","Ranjan");
                char[] password = service.generatePassword();
                service.showCredentials(email,password);
                break;
            case 2:
                String email2 = service.generateEmailAddress("Abhishek","Ranjan");
                char[] password2 = service.generatePassword();
                service.showCredentials(email2,password2);
                break;
            case 3:
                String email3 = service.generateEmailAddress("Abhishek","Ranjan");
                char[] password3 = service.generatePassword();
                service.showCredentials(email3,password3);
                break;
            case 4:
                String email4 = service.generateEmailAddress("Abhishek","Ranjan");
                char[] password4 = service.generatePassword();
                service.showCredentials(email4,password4);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
