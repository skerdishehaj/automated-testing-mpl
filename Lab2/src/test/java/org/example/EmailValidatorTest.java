package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    public EmailValidatorTest() {
    }

    @Test
    public void testValidEmail() {
        Assertions.assertTrue(EmailValidator.isValidEmail("example@example.com"));
    }

    @Test
    public void testNullEmail() {
        Assertions.assertFalse(EmailValidator.isValidEmail((String)null));
    }

    @Test
    public void testEmptyEmail() {
        Assertions.assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    public void testInvalidFormatEmail() {
        Assertions.assertFalse(EmailValidator.isValidEmail("example@com"));
    }

    @Test
    public void testInvalidPart1() {
        Assertions.assertFalse(EmailValidator.isValidEmail("@example.com"));
    }

    @Test
    public void testInvalidPart2() {
        Assertions.assertFalse(EmailValidator.isValidEmail("example@com"));
    }
}
