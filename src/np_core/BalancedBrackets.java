package np_core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BalancedBrackets {
    static ArrayList<String> brackets = new ArrayList<>();
    static String finalAnswer = "YES";
    static String isBalanced(LekeLinkedList<Character> list) {
        String answer ="YES";
        if(list.size()!=0){
            if(list.size()% 2 == 0 && brackets.contains( list.pollFirst().toString()+list.pollLast().toString())){
//                System.out.println(list.peekFirst().toString()+list.peekLast().toString());
                isBalanced(list);
            }
            else {
                answer = "NO";
                finalAnswer = answer;
            }
        }

        answer = answer.equals("default") ? "NO" : "YES";
        return finalAnswer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        brackets.add("[]"); brackets.add("{}"); brackets.add("()");
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            String s = in.next();
            LekeLinkedList<Character> list = new LekeLinkedList<>();
            for( char j : s.toCharArray()){
                list.add(j);
            }
            String result = isBalanced(list);
            finalAnswer = "YES";
            System.out.println(result);
        }
        in.close();
    }
}
/*{[()]}
{[(])}
        {{[[(())]]}}*/