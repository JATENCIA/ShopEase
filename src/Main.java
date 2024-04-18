import model.CreditCard;
import model.Shop;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the credit card value: ");
        double limit = scanner.nextDouble();
        CreditCard creditCard = new CreditCard(limit);
        int exit = 1;

        while (exit == 1) {

            System.out.println("Enter the purchase description: ");
            String description = scanner.next();

            System.out.println("Enter the purchase amount: ");
            double value = Double.parseDouble(scanner.next());

            Shop shop = new Shop(value, description);
            boolean purchaseMade = creditCard.LaunchPurchase(shop);


            if (purchaseMade) {
                System.out.println("Purchase made : ");
                System.out.println("Enter 0 to exit or 1 to continue: ");
                exit = scanner.nextInt();
            } else {
                System.out.println("Insufficient balance");
                exit = 0;
            }

        }

        System.out.println("\n ***************** ");
        System.out.println("\n Purchase made : ");
        Collections.sort(creditCard.getShopList());
        for (Shop shop : creditCard.getShopList()) {
            System.out.println(shop.getDescription() + " - " + shop.getValue());
        }
        System.out.println("\n ***************** ");


        System.out.println("\n ***************** ");
        System.out.println("\nCard balance: " + creditCard.getBalance());
        System.out.println("\n ***************** ");


    }
}