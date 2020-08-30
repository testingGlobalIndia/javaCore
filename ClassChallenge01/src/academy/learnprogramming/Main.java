package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

     /*   BankAccount bankAccount = new BankAccount();
        bankAccount.withdrawalFund(200);

        BankAccount timAccount = new BankAccount("Tim","tim@email.com","324324234");
        System.out.println(timAccount.getEmail() + " -> "+timAccount.getCustomerName());

        VipCustomer vip = new VipCustomer("5 Lakh","Tom@g.com");
        System.out.println(vip.getName() + " - > " + vip.getCreditLimit() + " -> "+vip.getEmail());*/

       /* Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());*/

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }


}
 class Wall
{
    private double width;
    private double height;

    public Wall(){

    }

    public Wall(double width, double height){
        if(width < 0 ){
            this.width =0;
        }else{
            this.width = width;
        }

        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
        }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        if(width <0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height <0){
            this.height =0;
        }else{
            this.height =height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }
}

class Point{

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return  distance(0,0);
    }

    public double distance(int x, int y){
        double firstDistance = Math.pow(this.getX() - x,2);
        double secondDistance = Math.pow(this.getY() - y,2);
        return Math.sqrt(firstDistance + secondDistance);
    }

    public double distance(Point point){
       return  distance(point.x,point.y);
    }
}

class Floor{

    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea(){
        return this.width * this.length;
    }
}

class Carpet{

    private double cost;

    public Carpet(double cost) {
        if(cost <0){
            this.cost = 0;
        }else{
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}

class Calculator{

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotal(){
        double areaOfFloor = floor.getArea();
        return areaOfFloor * carpet.getCost();
    }
}

class ComplexNumber{

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary  = this.imaginary + imaginary;
    }

    public void add(ComplexNumber complexNumber){
        add(complexNumber.real,complexNumber.imaginary);
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary   = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.real,complexNumber.imaginary);
    }
}
