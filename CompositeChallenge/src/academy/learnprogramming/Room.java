package academy.learnprogramming;

public class Room {

    private Furniture furniture;
    private Wall wall;

    public Room(Furniture furniture, Wall wall) {
        this.furniture = furniture;
        this.wall = wall;
    }

    public void getRoomDescriptions(){
        System.out.println("Below is the description of room");
        getWallProperties();
        getTypeOfFurniture();
    }

    private void getWallProperties(){
        getWall().wallProperties();
    }

    private void getTypeOfFurniture(){
        getFurniture().typeOfFurniture();
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Wall getWall() {
        return wall;
    }
}
