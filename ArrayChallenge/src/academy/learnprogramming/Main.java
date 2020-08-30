package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
        int[] mySortedArray = sortIntegers(myIntArray);
        printArray(mySortedArray);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" of items");
        int[] array = new int[number];
        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.println("Your array is ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] newSortedArray = new int[array.length];
        int i=1;
        while(i<array.length){
            if(array[i] > array[i-1]){
                newSortedArray[i-1] = array[i];
                array[i] = array[i-1];
                array[i-1]= newSortedArray[i-1];
                i++;
            }else{
                newSortedArray[i-1] = array[i-1];
                i++;
            }
            newSortedArray[i-1] = array[i-1];
        }
        return newSortedArray;
    }

}
