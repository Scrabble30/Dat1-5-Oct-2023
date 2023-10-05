package Task3;

import java.util.ArrayList;

public class Building {

    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloor;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloor, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloor = numberOfFloor;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
