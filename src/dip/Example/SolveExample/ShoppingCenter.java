package dip.Example.SolveExample;

public class ShoppingCenter {

    // not loosely coupled need to change every instance to be able to use credit card
    // instead of debit card if there is an error. ( we implement an interface )
    private BankCard bankCard;

    public ShoppingCenter(DebitCard depitCard) {

        this.bankCard = bankCard;
    }

    public void payUsingCard(long amount){

        bankCard.transaction(amount);
    }
    /**
     * The only place we need to change to make the transaction work is here
     * rather than all instances
     */
    public static void main(String[] args) {
        //DebitCard debitCard = new DebitCard();
       // CreditCard creditCard = new CreditCard();


        BankCard bankCard = new DebitCard();
            ShoppingCenter shoppingcenter = new ShoppingCenter((DebitCard) bankCard);
    shoppingcenter.payUsingCard(5000);



    }
}
