package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private final ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("coffees.txt");

        try {
            Scanner scanner = new Scanner(file);
            coffeeMenu.clear();

            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Error: File not found.");
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
    }
}
