package selfwork;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by root on 3/11/17.
 */
public class AtHome {
    LinkedHashMap<String, String> codes = new LinkedHashMap<>();
    Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        AtHome home = new AtHome();
        System.out.print("Enter the key :");
        String m = home.input.nextLine();
        System.out.println("Enter the Value :");
        String n = home.input.nextLine();
        home.codes.put("Color", "Blue");
        home.codes.put("Food","Rice");
        home.codes.put("Car","Ferrari");
        home.codes.put("Master","Oluwalekae");
        home.codes.put(m,n);
        System.out.println(home.codes);
        BigInteger hello;
    }

}
