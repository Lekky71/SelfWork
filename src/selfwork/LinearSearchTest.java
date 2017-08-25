package selfwork;
import java.util.Scanner;
import java.util.InputMismatchException;
public class LinearSearchTest {
	public static void main(String args[]){ 
		int position ;
		int searchInt ;
		Scanner input = new Scanner(System.in);
		
		LinearArray searchArray = new LinearArray(10);
		System.out.println(searchArray);
		try{
		
		System.out.println("Enter the integer you want to search for, Enter -1 to cancel\n");
		searchInt = input.nextInt();
		while(searchInt != -1){
			position = searchArray.linearSearch(searchInt);
			if(position == -1 )
				System.out.printf("The integer %d was not found\n", searchInt);
			else
				System.out.printf("The integer %d was found in the position %d\n", searchInt, position);
			
			System.out.println("Enter the integer you want to search for, Enter -1 to cancel\n");
			searchInt = input.nextInt();
				
		}
		}
		catch(InputMismatchException e){
			System.err.println(" error " + e.getMessage() + e.getCause());
		}
		
		
		
	}

}
