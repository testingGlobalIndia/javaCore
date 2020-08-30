package academy.learnprogramming;

public class Wall {

    private String color;
    private Dimensions dimensions;

    public Wall(String color, Dimensions dimensions) {
        this.color = color;
        this.dimensions = dimensions;
    }

    public void wallProperties(){
        System.out.println("Wall color is "+getColor());
        getDimensions().getArea();
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
