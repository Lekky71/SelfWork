package selfwork;
public class Palindrome {
    public static void main(String[] args){


        System.out.println(isPalindrome("madam"));
    }
    public static boolean isPalindrome(String word){
        int half = word.length()/2 ;
        String firstHalf = word.substring(0,half) ;
        String secondHalf = word.substring(half,-word.length());
        if(firstHalf == secondHalf){
            return true;
        }
        else{
            return false;
        }
    }
}
