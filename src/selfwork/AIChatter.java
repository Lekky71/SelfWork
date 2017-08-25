package selfwork;

import java.io.*;
import java.util.Scanner;
import java.util.Formatter;

/**
 * Created by root on 3/13/17.
 */
public class AIChatter {
    private Scanner input = new Scanner(System.in);


    public String listen(){
        String words = input.nextLine();
        return words;
    }
    public void talk(){

        try{
            Formatter store = new Formatter("/root/Pictures/AIChatter.txt");

            System.out.println("Hello, My name is Lekae\n so nice to meet you, can you tell me your name");
            String username = listen();
            store.format("%s",username);
            store.close();
            System.out.printf("Cool, so nice to meet you, %s",name());

        }
        catch(FileNotFoundException fnf){
            System.err.println("file not found");
        }
    }
    public String name () throws FileNotFoundException{

            FileInputStream reader = new FileInputStream("/root/Pictures/AIChatter.txt");
            Scanner gettr = new Scanner(reader);
            return gettr.nextLine();
////        catch (Exception e){
////            System.err.println("File not found");
//        }
    }
    public static void main(String args[]){
        AIChatter bot = new AIChatter();
        bot.talk();
    }
}
