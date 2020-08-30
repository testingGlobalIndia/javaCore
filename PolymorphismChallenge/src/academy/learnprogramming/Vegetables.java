package academy.learnprogramming;

public class Vegetables {

    private int lettucePrice;
    private int tomatoPrice;
    private int carrotPrice;
    private int onionPrice;
    private int potatoPrice;

    public Vegetables(int lettucePrice, int tomatoPrice, int carrotPrice, int onionPrice, int potatoPrice) {
        this.lettucePrice = lettucePrice;
        this.tomatoPrice = tomatoPrice;
        this.carrotPrice = carrotPrice;
        this.onionPrice = onionPrice;
        this.potatoPrice = potatoPrice;
    }

    public int getLettucePrice() {
        return lettucePrice;
    }

    public int getTomato() {
        return tomatoPrice;
    }

    public int getCarrot() {
        return carrotPrice;
    }

    public int getOnion() {
        return onionPrice;
    }

    public int getPotato() {
        return potatoPrice;
    }
}
