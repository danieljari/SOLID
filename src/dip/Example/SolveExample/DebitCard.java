package dip.Example.SolveExample;

public class DebitCard implements BankCard {

    public void transaction(long amount){
        System.out.println("Pay using Debit card");
    }
}
