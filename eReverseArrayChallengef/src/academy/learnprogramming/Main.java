package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of element you want in an Array");
        int count = scanner.nextInt();
        int[] myArray = getArray(count);
    }

    public static int[] getArray(int count){
        System.out.println("Enter "+count+ " elements in an array");
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
