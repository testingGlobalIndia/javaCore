package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String privateVar = "this is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("Scope intance privateVar is "+scopeCheck.getPrivateVar());
        System.out.println(privateVar);

        scopeCheck.timesTwo();

    }
}
