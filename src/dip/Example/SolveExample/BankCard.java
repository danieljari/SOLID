package dip.Example.SolveExample;

public interface BankCard {

    public default void transaction(long amount){
        System.out.println(" - passed ");
    }
}
