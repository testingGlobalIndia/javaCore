package academy.learnprogramming;

public class HealthyBurger extends  Hamburger{

    private String rollType;
    private Sauce sauce;

    public HealthyBurger(String breadRollType,int price) {
        super(breadRollType,"No meat",price);
    }

    public String getRollType() {
        return rollType;
    }

}
