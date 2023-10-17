package com.example;


import org.example.HelloMavenApp;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HelloMavenAppTest {

    @Test
    public void testMainMethodOutput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        HelloMavenApp.main(null);

        System.setOut(System.out);

        String expectedOutput = "Hello, Maven!" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
