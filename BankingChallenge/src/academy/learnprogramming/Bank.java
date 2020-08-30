package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void add(Branch branch){
        if(findBranch(branch) <0){
            branches.add(branch);
        }
    }

    public void addCustomerToBranch(Branch branch,String customerName, double initialAmount){
        branch.add(customerName,initialAmount);
        add(branch);
    }

    public void addAdditionalTransactionalToBranch(Branch branch,String customerName, double additionalAmount){
        branch.addAdditionalTransaction(customerName,additionalAmount);
        add(branch);
    }

    private int findBranch(Branch branch){
        return  branches.indexOf(branch);

    }

    public void printCustomers(){

        for(int i=0;i<branches.size();i++){
            Branch branch = branches.get(i);
            for(int j= 0; j< branch.getCustomerList().size();j++){
                System.out.println((j+1)+ ". customer name "+branch.getCustomerList().get(j).getName());
                System.out.println("Amount transactions are as below:");
                for(int k=0;k<branch.getCustomerList().get(j).getTransactions().size();k++){
                    System.out.println((k+1) +". "+branch.getCustomerList().get(j).getTransactions().get(k));
                }
            }
            System.out.println("=========================================================");
        }
    }
}
