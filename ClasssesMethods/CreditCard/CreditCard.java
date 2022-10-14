package ClasssesMethods.CreditCard;

import java.util.Random;

public class CreditCard {
    private String account_name;
    private int current_balance;
    private int add;

    public CreditCard() {
    }

    public CreditCard(String account_name, int current_balance) {
        this.account_name = account_name;
        this.current_balance = current_balance;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void setCurrent_balance(int current_balance) {
        this.current_balance = current_balance;
    }

    public String getAccount_name() {
        return account_name;
    }

    public int getCurrent_balance() {
        return current_balance;
    }

    public void getInfoAdd() {
        System.out.println("Account name: " + account_name);
        System.out.println("Current balance: " + current_balance);
    }

    public int addSomeValue(int add) {
        add = add + current_balance;
        System.out.println("Updated balance: " + add);
        return add;
    }

    public int withdrawSomeValue(int withdraw) {
        withdraw = current_balance - withdraw;
        System.out.println("Updated balance: " + withdraw);
        return withdraw;
    }
}
