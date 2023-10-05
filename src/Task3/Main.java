package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(3, 6, 4);
        Room room2 = new Room(5, 7, 8);
        Room room3 = new Room(2, 4, 5);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 4, 5, false);

        System.out.println("Lamps in building: " +countLampsInBuilding(building));
        System.out.println("Is building normal? " + isNormal(building));
    }

    public static int countLampsInBuilding(Building building) {
        int totalNumLamps = 0;

        for (Room room : building.getRooms()) {
            totalNumLamps += room.getNumberOfLamps();
        }

        return totalNumLamps;
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloor() > building.getRooms().size()) {
            System.out.println("This is an odd building");
            return false;
        } else {
            return true;
        }
    }
}
