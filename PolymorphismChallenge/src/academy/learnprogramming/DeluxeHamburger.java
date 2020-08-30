package academy.learnprogramming;

public class DeluxeHamburger extends  Hamburger{

    private AdditionalItems additionalItems;

    public DeluxeHamburger(String breadRollType, int price) {
        super("Brown Bread","No meat",300);
    }


    @Override
    public void basePrice() {
        System.out.println("Base price of Delux Hamburge is "+this.getPrice());
    }
}
