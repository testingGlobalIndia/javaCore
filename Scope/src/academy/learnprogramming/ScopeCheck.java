package academy.learnprogramming;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("Scope check created, public bar = "+publicVar + "private bar = "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for(int i=0;i<10;i++){
            System.out.println(i +"times two is "+i *privateVar );
        }
    }
}
