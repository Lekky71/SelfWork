package csc_assignment;
import java.util.Scanner;
public class NumberNine {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double principal ;
        double rate = 0;
        double typeA = 1.5, typeB = 2, typeC = 1.5, typeX = 5;
        String accountType;
        System.out.println("Enter amount of money : ");
        principal = in.nextDouble();
        System.out.println("Enter the your account type : ");
        accountType = in.next();
        accountType = accountType.toLowerCase();
        switch (accountType){
            case "a": rate = typeA; break;
            case "b": rate = typeB; break;
            case "c": rate = typeC; break;
            case "x": rate = typeX; break;
            default:
                System.out.println("you have to enter a valid answer");
        }
        System.out.println("The interest of #"+principal+" on account type "+ accountType.toUpperCase()+
                " is #"+resolveInterest(principal,rate));
    }

    public static double resolveInterest(double principal, double rate){
        double interest ;
        interest = (principal * rate * 1 )/100;
        return interest;
    }
}
