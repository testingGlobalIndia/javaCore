package academy.learnprogramming;

public class Furniture {

    private int table;
    private int chair;
    private int sofa;
    private Bed bed;

    public Furniture(int table, int chair, int sofa, Bed bed) {
        this.table = table;
        this.chair = chair;
        this.sofa = sofa;
        this.bed = bed;
    }

    public void typeOfFurniture(){
        System.out.println("You have "+getTable() + " table "+getChair()+" Chair "+ getSofa() + " sofa");
        getBed().bedDimension();
    }

    public int getTable() {
        return table;
    }

    public int getChair() {
        return chair;
    }

    public int getSofa() {
        return sofa;
    }

    public Bed getBed() {
        return bed;
    }
}
