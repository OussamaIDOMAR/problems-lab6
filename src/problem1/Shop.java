package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";

        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.nextLine();

            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();

            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            double total = 0;
            System.out.println("\nCart contents:");

            for (Item it : cart) {
                System.out.println(it);
                total += it.getPrice() * it.getQuantity();
            }

            System.out.println("Total price: " + total);

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();

        } while (keepShopping.equalsIgnoreCase("y"));

        scan.close();
    }
}
