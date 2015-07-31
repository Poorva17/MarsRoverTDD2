package com.marsrover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {

    public void print(String position) {
        System.out.println(position);
    }

    public String acceptInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }
}
