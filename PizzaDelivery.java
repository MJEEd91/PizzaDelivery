import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("How many topping do you want? ");
    int NumToppings = scan.nextInt(); scan.nextLine();
    String[] toppings = new String[NumToppings];

        System.out.println("Great, enter each topping");
        for (int i = 0; i < toppings.length; i++){
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
        }
        System.out.println("\n\nThank you! Here are the toppings you ordered ");
        for (int i = 0; i < toppings.length; i++){
            System.out.println(i + ". " + toppings[i]);
        }

        System.out.println("\n\nif you want to confirm the order press anything");
        scan.nextLine();
        System.out.println("Great news, a driver is on the way now!");
        scan.close();
    }

}
