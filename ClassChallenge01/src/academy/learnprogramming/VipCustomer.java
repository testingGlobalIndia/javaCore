package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private String creditLimit;
    private String email;


    public VipCustomer(){
        this("Default","1 lakh","default@g.com");
    }


    public VipCustomer(String creditLimit,String email){
        this("Tom",creditLimit,email);
    }

    public VipCustomer(String name, String creditLimit, String email){
        this.name = name;
        this.creditLimit =creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
