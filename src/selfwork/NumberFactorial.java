package selfwork;
import javax.swing.JOptionPane;
/**
 * Created by root on 4/23/17.
 */
public class NumberFactorial {
    public static void main(String args[]){
        boolean cont = false ;
        while(cont == false) {
            String num = JOptionPane.showInputDialog("Enter a number");
            try {
                int number = Integer.parseInt(num);
                cont = true;
                if(number>12 || number < 0){
                    JOptionPane.showMessageDialog(null,"Enter a number between 1 and 12");
                    cont = false;
                }else {
                    int result = factorial(number);
                    JOptionPane.showMessageDialog(null, "The factoral of "+number+" is "+result);
                }
            } catch (Exception e) {
            }
        }
    }
    public static int factorial(int n){
        if(n<=1){
            return 1 ;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
