package selfwork;

public class GenericMethodTest {
	public static <E> void printArray(E[] inputArray){
		for (E element : inputArray)
			System.out.printf("%s ", element);
		System.out.println("");
	}
	
	public static void main(String args[]){
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		System.out.println("These are the printed arrays");
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}

}
