//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a**2 + b**2 = c**2
//For example, 3**2 + 4**2 = 9 + 16 = 25 = 52.
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
//
//
public class Pythagorean{
    static int sumOfTriplets = 1000;
    public static void main(String[] args){
        for(int a=0;a<=sumOfTriplets;a++){
            for(int b =0;b<=sumOfTriplets;b++){
                for(int c = 0; c<=sumOfTriplets;c++){
                    if(a<b && b<c && a+b+c == sumOfTriplets && (a*a) + (b*b) == (c*c)){
                        int productOfTriplets = a * b * c ;
                        System.out.println(productOfTriplets);
                    }
                }
            }
        }
    }
}

