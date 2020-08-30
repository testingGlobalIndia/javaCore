package academy.learnprogramming;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private int price;
    private String name;
    private Vegetables vegetables;


    public Hamburger(String breadRollType, String meat, int price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }


    public void setVegetables(Vegetables vegetables) {
        this.vegetables = vegetables;
    }

    public Vegetables getVegetables() {
        return vegetables;
    }

    public void basePrice(){
        System.out.println("Base price of Burger is "+this.price);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
