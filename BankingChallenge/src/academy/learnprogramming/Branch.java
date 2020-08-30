package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customerList;

    public Branch(ArrayList<Customer> customers) {
        customerList = customers;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void add(String newCustomer, double initialAmount ){
        Customer customer = new Customer(newCustomer,initialAmount);
        customerList.add(customer);
    }

    public void addAdditionalTransaction(String customerName, double amount){
        Customer customer = findCustomer(customerName);
        if( customer != null){
            customer.addTransaction(amount);
        } else{
            System.out.println(customerName + " user does not exists in list");
        }
    }

    private Customer findCustomer(String customerName){
        for(Customer customer: customerList ){
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        return null;
    }

}
