package np_core;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Scanner;

public class MyStack {
    public  int size;
    int length;
    private int top;
    public int[] elements;

    public MyStack(){
        this(10);
    }
    public MyStack(int s){
        top = - 1;
        elements = new int[s];
    }
    public int getSize(){
        return top + 1 ;
    }
    public int peek(){
        if( isEmpty() ){}
        return elements[top];
    }
    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int value){
        if (top == elements.length - 1)
            resize(     2 * elements.length);

        elements[++top] = value;
    }
    public int pop(){
        if(top == -1){
//            throw new EmptyStackException("this stack is empty, cannot perform the operation pop");
            return 0 ;
        }
        int itm = elements[top];
        elements[top--] = 0;

        if(top > 0 && top == elements.length / 4)
            resize (elements.length/2);

        return itm;
    }


    private void resize (int newSize)
    {
        int t[] = new int[newSize];
        for (int i = 0; i <= top; i++)
            t[i] = elements[i];
        elements = t;
    }

    public static <E extends Comparable<E>> void selectionSort(E[] list)
    {
        for(int i=0; i<list.length -1; i++)
        {
            int iSmallest = i;

            for(int j=i+1; j<list.length; j++)
            {
                if(list[iSmallest].compareTo(list[j]) > 0  )
                {
                    iSmallest = j;
                }
            }
            E iSwap = list[iSmallest];
            list[iSmallest] = list[i];
            list[i] = iSwap;

        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int noOftimes = Integer.parseInt(in.nextLine());
        MyStack myStack = new MyStack();

        int[] commands = new int[noOftimes];
        int[] values = new int[noOftimes];

        for(int i = 0;i<noOftimes;i++){
            String input = in.nextLine().trim();
            String[] inputs = input.split(" ");
            int command = Integer.parseInt(inputs[0]);
            commands[i] = command;
            if(inputs.length > 1){
                int value = Integer.parseInt(inputs[1]);
                values[i] = value;
            }

        }
        for(int i = 0;i<noOftimes;i++){
            solveForOption(myStack,commands[i],values[i]);
        }


    }
    public static void solveForOption(MyStack myStack, int command,int tempValue){
        if(command ==1 ){
            myStack.push(tempValue);
        }
        else if(command == 2){
            myStack.pop();
        }
        else if(command == 3){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i <= myStack.top; ++i)
                max = Math.max(max, myStack.elements[i]);
            System.out.println(max);
        }
    }




}
