package selfwork;
import java.util.Scanner ;
public class BinarySearchTest {
	public static void main(String args []){
		Scanner input = new Scanner(System.in);
		int searchInt ;
		int position ;
		
		BinarySearch searchArray = new BinarySearch(34);
		System.out.println(searchArray);
		
		System.out.print("Please enter an integer value (-1 to quit): " );
		searchInt = input.nextInt(); // read an int from user
		System.out.println();
		// repeatedly input an integer; -1 terminates the program
		while ( searchInt != -1 ){
			// use binary search to try to find integer
			position = searchArray.binaryFind( searchInt );
			// return value of -1 indicates integer was not found
			if ( position == -1 )
			System.out.println( "The integer " + searchInt +" was not found.\n" );
			else
			System.out.println( "The integer " + searchInt +" was found in position " + position + ".\n" );
			// get input from user
			System.out.print("Please enter an integer value (-1 to quit): " );
			searchInt = input.nextInt(); // read an int from user
			System.out.println();
		} // end while
	}
}
