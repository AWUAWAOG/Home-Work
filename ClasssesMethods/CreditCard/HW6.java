package ClasssesMethods.CreditCard;

import ClasssesMethods.CreditCard.CreditCard;

public class HW6 {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        creditCard.setAccount_name("User");
        creditCard.setCurrent_balance(3900);
        creditCard.getInfoAdd();
        creditCard.addSomeValue(2500);
        creditCard.withdrawSomeValue(500);

        CreditCard creditCard1 = new CreditCard("User11", 1500);
        CreditCard creditCard2 = new CreditCard("User22", 2500);
        CreditCard creditCard3 = new CreditCard("User33", 3500);
        creditCard1.addSomeValue(450);
        creditCard2.addSomeValue(360);
        creditCard3.withdrawSomeValue(410);
    }
}
