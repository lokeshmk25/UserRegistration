package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidationTest {
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result =userValidator.validateEmailAddress("loki@gmail.com");
        Assertions.assertEquals(true,result);
    }
}
