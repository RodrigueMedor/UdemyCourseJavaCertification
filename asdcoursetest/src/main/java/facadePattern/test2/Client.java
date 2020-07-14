package facadePattern.test2;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccountfacade accountfacade = new BankAccountfacade(123400,8943);

        accountfacade.withdrawCash(50.00);
        accountfacade.withdrawCash(900.00);
        accountfacade.deposit(500.00);
    }
}
