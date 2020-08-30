package academy.learnprogramming;

public class Dimensions {

    private int width;
    private int length;

    public Dimensions(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void getArea(){
        System.out.println("Area of wall is "+width * length);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
