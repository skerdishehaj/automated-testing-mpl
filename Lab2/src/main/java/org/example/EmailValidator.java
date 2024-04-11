package org.example;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class EmailValidator {
    public EmailValidator() {
    }

    public static boolean isValidEmail(String email) {
        if (email != null && !email.isEmpty()) {
            String[] parts = email.split("@");
            if (parts.length != 2) {
                return false;
            } else {

                String part1 = parts[0];
                String part2 = parts[1];
                if (!part1.isEmpty() && !part2.isEmpty()) {
                    if (!part1.matches("[a-zA-Z0-9._-]+")) {
                        return false;
                    } else {
                        return part2.matches("[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
}
