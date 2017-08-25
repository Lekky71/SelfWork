package selfwork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by oluwalekefakorede on 18/06/2017.
 */
public class PasswordCracker {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        cracker(1);
    }

    public static void cracker(int times){
        for(int i =0;i<times;i++){
            int no_of_users = input.nextInt();
            String passwords ;
//            for(int j =0;j<=no_of_users;j++){
                passwords = input.nextLine();
//            }
            System.out.println();
            String word = input.nextLine();
            System.out.println(passwords);
            String [] passes = passwords.split(" ");
            System.out.println(passes.toString());
            StringBuilder builder = new StringBuilder();
            for(String pass : passes){
                if(word.indexOf(pass)!= -1){
                    System.out.println(pass);
                    builder.append(pass + " ");
                }
                else{
                    System.out.println("WRONG PASSWORD");
                }
            }
            String passway = builder.toString();
//            if(chars.containsAll(wordings)){
//                System.out.println(word);
//            }else{
//                System.out.println("WRONG PASSWORD");
//            }
            System.out.println(passway);

        }
    }
}
