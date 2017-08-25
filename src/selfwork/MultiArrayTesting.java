package selfwork;

public class MultiArrayTesting {
	public static void main(String args []){
		int matrix[][]= {{1,2,6},{4,6,7},{6,9,0}};
//		System.out.println(matrix.length);
		//this is to loop through and show the elements of the matrix
		for(int i =0;i < matrix.length;i++)
			for(int j =0; j < matrix[0].length;j++)
				System.out.printf("The value at location ar[%s][%s] is : %s\n", i,j,matrix[i][j] );
				
	}

}
