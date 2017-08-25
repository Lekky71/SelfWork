package selfwork;

public class PascalTriangle {
	int multiple ;
	public void doPascal(int multi){
		multi = multiple ;
		if(multi ==1){
			System.out.printf("%d ",1);
		}
		else{
			doPascal(multi-1);
		}
	}
	public static void main(String args[]){
		PascalTriangle tester = new PascalTriangle();
		tester.multiple = 2 ;
		tester.doPascal(tester.multiple);
	}

}
