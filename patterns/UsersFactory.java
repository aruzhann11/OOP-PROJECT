package patterns;

import enums.Gender;
import models.Student;
import models.User;

public class UsersFactory {

    public static User createUser(
            String role,
            String username,
            String password,
            String firstName,
            String lastName,
            Gender gender
    ) {

        if(role.equals("student")) {

            return new Student(
                    username,
                    password,
                    firstName,
                    lastName,
                    gender,
                    1
            );
        }

        return null;
    }
}