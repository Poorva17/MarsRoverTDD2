package com.marsrover;

public class MarsRover {
    private int positionX;
    private int positionY;
    private String direction;

    public MarsRover(int positionX, int positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public String getPosition() {
        return positionX+" "+positionY+" "+direction;
    }
}
