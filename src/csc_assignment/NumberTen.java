package csc_assignment;
import java.util.Scanner;
public class NumberTen {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double principal ;
        double rate = 0;
        double typeA = 1.5, typeB = 2, typeC = 1.5, typeX = 5;
        double limitA = 250, limitB = 1000, limitC = 250, limitX = 5000;
        String accountType;
        System.out.println("Enter amount of money : ");
        principal = in.nextDouble();
        System.out.println("Enter the your account type : ");
        accountType = in.next();
        accountType = accountType.toLowerCase();
        switch (accountType){
            case "a":if(principal >= limitA) rate = typeA; break;
            case "b ":if(principal >= limitB) rate = typeB; break ;
            case "c": if(principal >= limitC) rate = typeC; break;
            case "x": if(principal >= limitX) rate = typeX; break;
            default: System.out.println("you have to enter a valid answer");
        }
        if(rate == 0){
            System.out.println("Sorry, #"+principal + " is too small for the account type "
                    +accountType.toUpperCase());
        }else{
            System.out.println("The interest of #"+principal+" on account type "+ accountType.toUpperCase()+
                    " is #"+resolveInterest(principal,rate));
        }
    }
    public static double resolveInterest(double principal, double rate){
        double interest ;
        interest = (principal * rate * 1 )/100; //number 10 continued
        return interest;
    }
}
