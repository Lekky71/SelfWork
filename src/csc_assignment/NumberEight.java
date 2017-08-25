package csc_assignment;
import java.util.Scanner;
public class NumberEight {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double basePrice = 375.99, inch_43 = 99.99, inch_38 = 75.99, dvd = 65.99, printer = 125.00, cart = basePrice;
        System.out.println("Enter your choice for screen size : (1) 43 inches (2) 38 inches");
        int choice = in.nextInt();
        switch(choice){
            case 1 : cart += inch_43; break;
            case 2 : cart += inch_38; break;
            default: cart += 0; System.out.println("no option for that");
        }
        System.out.println("What else do you want to add ? (1) nothing (2) DVD/CD Writer (3) Printer");
        int answer = in.nextInt();
        switch (answer){
            case 1: System.out.println("You are paying #"+cart); break;
            case 2: cart += dvd; System.out.println("You are paying #"+cart); break;
            case 3: cart += printer; System.out.println("You are paying #"+cart); break;
        }

    }
}
