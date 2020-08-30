package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of elements you needed");
        int count = scanner.nextInt();
        int[] myNewArray = readIntegers(count);
        System.out.println(findMin(myNewArray));


    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter "+ count+ "elements in an array");
        for(int i =0; i<count;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int smallest = 0;
        for(int i=0;i<array.length;i++){
            if(i==0) {
                smallest = array[i];
            } else{
                if(smallest > array[i]){
                    smallest = array[i];
                }
            }
            for(int j=1;j<array.length-1;j++){
                if(smallest > array[j]){
                    smallest = array[j];
                }
            }
        }
        return smallest;
    }
}
