package models;

import enums.Gender;
import enums.ManagerPosition;

public class Manager extends Employee {

    private ManagerPosition position;

    public Manager(String username,
                   String password,
                   String firstName,
                   String lastName,
                   Gender gender,
                   double salary,
                   ManagerPosition position) {

        super(
                username,
                password,
                firstName,
                lastName,
                gender,
                salary
        );

        this.position = position;
    }

    public void approveRegistration(
            Student student,
            Course course
    ) {

        System.out.println(
                "Registration approved"
        );
    }

    public ManagerPosition getPosition() {
        return position;
    }
}