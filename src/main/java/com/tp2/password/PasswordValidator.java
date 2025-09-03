package com.tp2.password;

public class PasswordValidator {
    
    public boolean isValid(String password) {
        // TODO: Implement password validation following TDD approach

        if (password == null || password.length() < 8) {
            return false;
        }


        if (!password.matches(".*[A-Z].*")) {
            return false;
        }


        if (!password.matches(".*[a-z].*")) {
            return false;
        }


        if (!password.matches(".*\\d.*")) { // todos los digitos
            return false;
        }


        if (!password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }


        return true;
    }
}
// Consider these criteria:
// - Minimum 8 characters
// - At least 1 uppercase letter
// - At least 1 lowercase letter
// - At least 1 number
// - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)