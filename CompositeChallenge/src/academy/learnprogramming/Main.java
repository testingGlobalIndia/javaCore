package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(20,40);
        Dimensions dimensions = new Dimensions(40,50);
        Furniture furniture = new Furniture(1,4,1, bed);
        Wall wall = new Wall("Pink",dimensions);
        Room bedRoom = new Room(furniture,wall);

        bedRoom.getRoomDescriptions();
    }
}
