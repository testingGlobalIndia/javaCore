package academy.learnprogramming;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount(){
        this(123560,300.0,"Tim","tim@email.com","1232322");
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account customer called");
        this.accountNumber = accountNumber;
        this.balance =balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public BankAccount(String customerName, String email, String phoneNumber) {
        this(789455,2300,customerName,email,phoneNumber);
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber(){
        return  this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return  this.phoneNumber;
    }

    public void depositFund(long fund){
        balance = balance + fund;
        System.out.println("Current balance is "+balance);
    }

    public void withdrawalFund(long fund) {
        if (balance < fund) {
            System.out.println("You have insufficient balance");
        } else {
            balance = balance - fund;
            System.out.println("your current balance is " + balance);
        }
    }
}
