package np_core;
public class CountingSort {
    public static void countingSort(int[]A,int k){
        k = k +1;
        int[] C = new int[k];
        for(int i =0;i<k;i++){ C[i] = 0; }
        for (int aA : A) {
            C[aA] = C[aA] + 1;
        }
        printContent(C); //for debugging
        for(int i=1;i<k;i++){
            C[i] = C[i] + C[i-1];
        }
        printContent(C); //for debugging
        System.out.println("The below is B after each iteration\n");
        int[]B = new int[A.length+1];
        for(int j = A.length-1;j>=0;j--){
            B[C[A[j]]] = A[j];
            C[A[j]] = C[A[j]] - 1;
            printContent(B); //for debugging
        }
    }
    public static void main(String args[]){
        int[] A = {2,5,3,0,2,3,0,3};
        int[] testB = {6,0,2,0,1,3,4,6,1,3,2};
//        countingSort(A,5);
        countingSort(testB,6);
        System.out.println("\n\n\n");
        countingSort1(testB,6);
    }

    public static void countingSort1(int[]A,int k){
        k = k +1;
        int[] C = new int[k];
        for(int i =0;i<k;i++){ C[i] = 0; }
        for (int aA : A) {
            C[aA] = C[aA] + 1;
        }
        printContent(C); //for debugging
        for(int i=1;i<k;i++){
            C[i] = C[i] + C[i-1];
        }
        printContent(C); //for debugging
        System.out.println("The below is B after each iteration\n");
        int[]B = new int[A.length+1];
        for(int j=0; j<A.length;j++){
            B[C[A[j]]] = A[j];
            C[A[j]] = C[A[j]] - 1;
            printContent(B); //for debugging
        }
    }

    /**
     *
     * @method printContent() is used for debugging sake
     */
    private static void printContent(int[] array){
        for (int num : array) {
            System.out.print("" + num + ",");
        }
        System.out.println();
    }
}


/*
FOR THE FIRST VERSION
0,0,0,0,0,0,2,0,0,0,0,0,
0,0,0,0,0,0,2,0,3,0,0,0,
0,0,0,0,1,0,2,0,3,0,0,0,
0,0,0,0,1,0,2,0,3,0,0,6,
0,0,0,0,1,0,2,0,3,4,0,6,
0,0,0,0,1,0,2,3,3,4,0,6,
0,0,0,1,1,0,2,3,3,4,0,6,
0,0,0,1,1,0,2,3,3,4,0,6,
0,0,0,1,1,2,2,3,3,4,0,6,
0,0,0,1,1,2,2,3,3,4,0,6,
0,0,0,1,1,2,2,3,3,4,6,6,

FOR THE SECOND VERSION(A question)
0,0,0,0,0,0,0,0,0,0,0,6,
0,0,0,0,0,0,0,0,0,0,0,6,
0,0,0,0,0,0,2,0,0,0,0,6,
0,0,0,0,0,0,2,0,0,0,0,6,
0,0,0,0,1,0,2,0,0,0,0,6,
0,0,0,0,1,0,2,0,3,0,0,6,
0,0,0,0,1,0,2,0,3,4,0,6,
0,0,0,0,1,0,2,0,3,4,6,6,
0,0,0,1,1,0,2,0,3,4,6,6,
0,0,0,1,1,0,2,3,3,4,6,6,
0,0,0,1,1,2,2,3,3,4,6,6,

 */