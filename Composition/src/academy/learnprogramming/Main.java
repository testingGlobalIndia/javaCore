package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor monitor = new Monitor("27 inch piece","Acer",27,new Resoulution(2400,1440));

        MotherBoard motherBoard = new MotherBoard("Intel","Acer",4,7,"2.44");

        PC pc = new PC(theCase,monitor,motherBoard);

        pc.powerUp();

    }
}
