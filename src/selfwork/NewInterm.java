package selfwork;

public class NewInterm {
	public static void main(String args[]){
//		String [] text = {"funk","furray","buranose","glucose"};
//		for(String e : text){
//			if(e.startsWith("fu")){
//				System.out.println(e+" starts wit fu");
//			}
//		}
		System.out.println(fact(5));
	}
	public static long fact(long n){
		if(n<=1)
			return 1;
		else
			return n * fact(n-1);
	}

}
