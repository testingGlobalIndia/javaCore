package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("My Float min value = "+myFloatMinValue);
        System.out.println("My Float max value = "+myFloatMaxValue);


        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("My Float min value = "+myDoubleMinValue);
        System.out.println("My Float max value = "+myDoubleMaxValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f /3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("MyFloatValue = "+myFloatValue);
        System.out.println("MyDoubleValue = "+myDoubleValue);

        double poundNumber = 30d;
        double poundToKilogram = poundNumber * 0.45359237;
        System.out.println(poundToKilogram);


    }
}
