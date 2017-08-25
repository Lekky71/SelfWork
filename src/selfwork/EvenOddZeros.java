package selfwork;
import java.util.*;
public class EvenOddZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double postive =0;
        double negative = 0;
        double zeros = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(String.valueOf(arr[arr_i]).contains("-")){
                ++negative;
            } else if (arr[arr_i] == 0){
                ++zeros;
            }else{
                ++postive;
            }
        }
        double dec_pos = postive/n;
        double dec_neg = negative/n;
        double dec_zero = zeros/n;
        System.out.printf("%.6f\n", dec_pos);
        System.out.printf("%.6f\n", dec_neg);
        System.out.printf("%.6f\n", dec_zero);

    }
}
