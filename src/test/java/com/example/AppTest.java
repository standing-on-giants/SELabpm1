package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testSum() {
        App app = new App();
        assertEquals(5, app.sum(2, 3));
    }
}