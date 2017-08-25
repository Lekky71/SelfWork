package selfwork;

/**
 * Created by oluwalekefakorede on 6/13/17.
 */
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> aNegative = new ArrayList<>();
            for(int a_i=0; a_i < n; a_i++){
                if(String.valueOf(in.nextInt()).contains("-")){
                    aNegative.add(in.nextInt());
                }
            }
            String decision = (aNegative.size() < k ? "YES" : "NO");
            System.out.println(decision);
        }
    }
}
