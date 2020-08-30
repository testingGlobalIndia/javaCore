package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contacts> contactsList = new ArrayList<>();
    private static MobilePhone mobilePhone = new MobilePhone(contactsList);


    public static void main(String[] args) {

        boolean quit = false;
        int choice =0;
        printMenu();
        while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0: printMenu();
                        break;
                case 1: MobilePhone.printContacts();
                        break;
                case 2: addContacts();
                        break;
                case 3: updateContacts();
                        break;
                case 4: removeContacts();
                        break;
                case 5: searchContacts();
                        break;
                case 6: quit = true;
                        break;

            }
        }
    }

    public static void printMenu(){
        System.out.println("Press options" +
                "\n\t  0. Print Menu" +
                "\n\t  1. Print contact list" +
                "\n\t  2. Add new contact" +
                "\n\t  3. Update contact" +
                "\n\t  4. Remove Contact" +
                "\n\t  5. Search Contact" +
                "\n\t  6. Quit");
    }

    public static void addContacts(){
        System.out.println("Enter contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        Contacts contacts = new Contacts(name,phone);
        MobilePhone.store(contacts);
    }

    public static void updateContacts(){
        System.out.println("Enter old contact name");
        String oldName = scanner.nextLine();
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone");
        String newPhone = scanner.nextLine();
        if(findContact(oldName)!=null){
            Contacts contacts = new Contacts(newName,newPhone);
            MobilePhone.modify(findContact(oldName),contacts);
        }
    }

    private static Contacts findContact(String contactName){
        for(Contacts contacts:contactsList){
            if(contacts.getName().equalsIgnoreCase(contactName)){
                return contacts;
            }
        }
        return null;
    }

    private static void removeContacts(){
        System.out.println("Enter contact name to remove");
        String name = scanner.nextLine();
        MobilePhone.remove(name);
    }

    private static void searchContacts(){
        System.out.println("Enter contact name to search");
        String name = scanner.nextLine();
        boolean status = MobilePhone.queryContact(name);
        if(status){
            System.out.println("Contact found");
        }else{
            System.out.println("Contact not found");
        }

    }


}
