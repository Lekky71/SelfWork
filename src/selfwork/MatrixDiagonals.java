package selfwork;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatrixDiagonals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int sumOfFirstDiagonals = 0;
        int sumOfSecondDiagonals = 0;
        for(int i=0;i<n;i++){
            sumOfFirstDiagonals += a[i][i];
        }
        for(int j=0;j<n;j++){
            sumOfSecondDiagonals += a[j][n-1-j];
        }
        int diff = sumOfFirstDiagonals > sumOfSecondDiagonals ? sumOfFirstDiagonals - sumOfSecondDiagonals : sumOfSecondDiagonals - sumOfFirstDiagonals ;
        System.out.println(diff);
    }
}
