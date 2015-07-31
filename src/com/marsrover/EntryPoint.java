package com.marsrover;

import java.io.IOException;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Parser parser = new Parser();

        MarsRoverApplication marsRoverApplication = new MarsRoverApplication(view, parser);
        marsRoverApplication.start();
    }
}
