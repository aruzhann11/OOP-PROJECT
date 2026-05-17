package models;

import enums.Gender;

public class Employee extends User {

    protected double salary;

    public Employee(String username,
                    String password,
                    String firstName,
                    String lastName,
                    Gender gender,
                    double salary) {

        super(
                username,
                password,
                firstName,
                lastName,
                gender
        );

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}