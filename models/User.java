package models;

import enums.Gender;
import java.io.Serializable;

public class User implements Serializable {

    protected String username;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected Gender gender;

    public User(String username,
                String password,
                String firstName,
                String lastName,
                Gender gender) {

        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {

        return firstName + " " + lastName;
    }
}