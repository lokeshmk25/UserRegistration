package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean validateEmailAddress(String email) {
        String Email = "^[A-Za-z0-9+_.-]+@(?=.*[a-z])[a-z0-9][a-zA-Z0-9.-]+.{2,3}$";
        Pattern pattern = Pattern.compile(Email);
        return pattern.matcher(email).matches();
    }
}
