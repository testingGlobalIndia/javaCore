package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of element you want in an Array");
        int count = scanner.nextInt();
        int[] myArray = getArray(count);
        printArray(myArray);
        reverse(myArray);
    }

    public static int[] getArray(int count){
        System.out.println("Enter "+count+ " elements in an array");
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void  printArray(int[] array){
        System.out.println("Below is non reverse array");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i=array.length-1,j=0;i>=0;i--,j++){
            reverseArray[j] = array[i];
        }
        System.out.println("Below is reverse array");
        for(int i=0;i<array.length;i++){
            System.out.println(reverseArray[i]);
        }
    }
}
