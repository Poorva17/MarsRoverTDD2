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
        return positionX + " " + positionY + " " + direction;
    }

    public void move(String instruction) {

        for (int i = 0; i < instruction.length(); i++) {
            moveOneGrid(instruction.charAt(i));
        }
    }

    private void moveOneGrid(char command) {

        if (command == 'L') {
            switch (direction) {
                case "N":
                    direction = "W";
                    break;
                case "W":
                    direction = "S";
                    break;
                case "S":
                    direction = "E";
                    break;
                case "E":
                    direction = "N";
                    break;
            }
        }
        if (command == 'R') {
            switch (direction) {
                case "N":
                    direction = "E";
                    break;
                case "E":
                    direction = "S";
                    break;
                case "S":
                    direction = "W";
                    break;
                case "W":
                    direction = "N";
                    break;
                }
        }

        if (command == 'M') {
            switch (direction) {
                case "N":
                    positionY++;
                    break;
                case "E":
                    positionX++;
                    break;
                case "S":
                    positionY--;
                    break;
                case "W":
                    positionX--;
                    break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        MarsRover marsRover = (MarsRover) o;

        if (positionX != marsRover.positionX)
            return false;
        if (positionY != marsRover.positionY)
            return false;
        return direction.equals(marsRover.direction);

    }

    @Override
    public int hashCode() {
        int result = positionX;
        result = 31 * result + positionY;
        result = 31 * result + direction.hashCode();
        return result;
    }
}
