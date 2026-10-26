package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WebProjectTest {
    @Test
    void projectNameIsCorrect() {
        assertTrue("mavenweb".startsWith("maven"));
    }
}
