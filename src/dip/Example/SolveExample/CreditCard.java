package dip.Example.SolveExample;

public class CreditCard implements BankCard{

    public void transaction(long amount){
        System.out.println("Pay using Credit card");
    }
}
