package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private static ArrayList<Contacts> contacts;

    public MobilePhone(ArrayList<Contacts> contact) {
        contacts = contact;
    }

    public static void store(Contacts contact){
        contacts.add(contact);
    }

    public static void remove(String contactName){
        int position = findContact(contactName);
        if( position>=0){
            contacts.remove(position);
        }else{
            System.out.println(contactName + "does not found in array list of contacts");
        }

    }

    public static void printContacts(){
        System.out.println("You have "+contacts.size() + " in your list");
        for(int i=0;i<contacts.size();i++){
            System.out.println(i+1 +". "+ contacts.get(i).getName() + " -> "+contacts.get(i).getPhone());
        }
    }

    private static int findContact(String contactName){
        for(Contacts contact1:contacts){
            if(contact1.getName().equalsIgnoreCase(contactName)){
                return contacts.indexOf(contact1);
            }
        }
        return -1;
    }

    private static int findContact(Contacts contact){
        return contacts.indexOf(contact);
    }

    public static void modify(Contacts oldContact, Contacts newContact){
        int positionFound = findContact(oldContact);
        int positionNewContact = findContact(newContact);
        if(positionNewContact >= 0){
            System.out.println(newContact +"Contact already exists");
        } else if(positionFound >= 0){
            contacts.set(positionFound,newContact);
        }
    }

    public static boolean queryContact(String contactName){
        if(findContact(contactName) >=0)
            return true;
        else
            return false;
    }

}
