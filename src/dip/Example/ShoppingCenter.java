package dip.Example;

public class ShoppingCenter {

    // not loosely coupled need to change every instance to be able to use credit card
    // instead of debit card if there is an error. ( we implement an interface )
    private DebitCard debitCard;

    public ShoppingCenter(DebitCard depitCard) {
        this.debitCard = debitCard;
    }

    public void payUsingCard(long amount){
        debitCard.transaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
    ShoppingCenter shoppingcenter = new ShoppingCenter(debitCard);
    shoppingcenter.payUsingCard(5000);
    }
}
