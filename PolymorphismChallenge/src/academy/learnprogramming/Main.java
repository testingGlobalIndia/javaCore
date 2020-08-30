package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int basePrice;
    public static int totalAmount;
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("On brown bread","Breast piece",250);
        HealthyBurger healthyBurger = new HealthyBurger("brown rye bread roll0",300);
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Brown Bread",400);

        Vegetables vegetables = new Vegetables(40,50,60,70,80);
        Sauce sauce = new Sauce(40,60);


        System.out.println("Which type of burger you wanna to buy");
        String burgerType = scanner.nextLine();

        if(burgerType.equals("Hamburger")) {
             basePrice = hamburger.getPrice();
             totalAmount = basePrice;
            while (true) {

                System.out.println("Do you want any additional item");
                String choice = scanner.nextLine();

                if (choice.equals("Yes")) {
                    System.out.println("Please provide additional item name");
                    String itemName = scanner.nextLine();
                    switch (itemName) {
                        case "tomato":
                            totalAmount +=  vegetables.getTomato();
                            break;
                        case "lettuce":
                            totalAmount += vegetables.getLettucePrice();
                            break;
                        case "Carrot":
                            totalAmount += vegetables.getCarrot();
                            break;
                        case "Onion":
                            totalAmount += vegetables.getOnion();
                            break;
                        case "Potato":
                            totalAmount += vegetables.getPotato();
                            break;
                    }
                }else{
                    System.out.println("Your total bill is "+totalAmount);
                    break;
                }
            }
        }

        if(burgerType.equals("HealthyBurger")) {
            basePrice = healthyBurger.getPrice();
            totalAmount = basePrice;
            while (true) {

                System.out.println("Do you want any additional item");
                String choice = scanner.nextLine();

                if (choice.equals("Yes")) {
                    System.out.println("Please provide additional item name");
                    String itemName = scanner.nextLine();
                    switch (itemName) {
                        case "RedSauce":
                            totalAmount +=  sauce.getRedSaucePrice();
                            break;
                        case "GreenSauce":
                            totalAmount += sauce.getChiliSaucePrice();
                            break;
                    }
                }else{
                    System.out.println("Your total bill is "+totalAmount);
                    break;
                }
            }
        }

        if(burgerType.equals("Deluxe hamburger")) {
            basePrice = deluxeHamburger.getPrice();
            totalAmount = basePrice;
            System.out.println("your total bill is "+totalAmount);
            }
        }
        }
