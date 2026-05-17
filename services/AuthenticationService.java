package services;

import models.User;
import storage.Data;

public class AuthenticationService {

    public User login(
            String username,
            String password
    ) {

        for(User user :
                Data.getInstance().getStudents()) {

            if(user.getUsername()
                    .equals(username)) {

                return user;
            }
        }

        return null;
    }
}