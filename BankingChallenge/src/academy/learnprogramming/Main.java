package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Branch> branches = new ArrayList<>();
        ArrayList<Customer> RohiniBranchcustomers = new ArrayList<>();
        Bank bank = new Bank(branches);

        Branch rohiniBranch = new Branch(RohiniBranchcustomers);
        bank.addCustomerToBranch(rohiniBranch,"Virender",123.45);
        bank.addAdditionalTransactionalToBranch(rohiniBranch,"Virender",1234);
        bank.addCustomerToBranch(rohiniBranch,"Sohan",100);
        System.out.println("=========================================================");

        ArrayList<Customer> MumbaiBranchcustomers = new ArrayList<>();

        Branch mumbaiBranch = new Branch(MumbaiBranchcustomers);
        bank.addCustomerToBranch(mumbaiBranch,"kumar",123.45);
        bank.addAdditionalTransactionalToBranch(mumbaiBranch,"kumar",1234);


        bank.printCustomers();

 


    }
}
