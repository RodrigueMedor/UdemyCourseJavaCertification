package test2;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposit){
        cashInAccount += cashDeposit;
    }
    public boolean haveEnoughMoney(double cashToWithdrawal){
        if(cashToWithdrawal > getCashInAccount()){
            System.out.println("Error: you don't have enough money in your account");
            System.out.println("Current Balance : "+getCashInAccount());
            return false;
        }else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal complete : Current balance is :"+ getCashInAccount());
            return true;
        }
    }

    public void makedeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete: Current balance"+ getCashInAccount());
    }
}
