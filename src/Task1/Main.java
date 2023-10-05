package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Abc", "Def", "ChickyChuck"));
        customers.add(new Customer("Ghi", "Jkl", "SunnyShare"));
        customers.add(new Customer("Mno", "Pqr", "CamelCarl"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
