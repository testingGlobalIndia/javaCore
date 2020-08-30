package academy.learnprogramming;

public class Bed {

    private  int length;
    private int width;

    public Bed(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void bedDimension(){
        System.out.println("Bed dimension is "+ length * width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
