public class CurrentAccount extends BankAccount {


    private int overdrawAmount;

    public int getOverdrawAmount() {
        return overdrawAmount;
    }

    public void setOverdrawAmount(int overdrawAmount) {
        if (overdrawAmount < 0) {
            this.overdrawAmount = 0;
        } else if (overdrawAmount > 300) {
            this.overdrawAmount = 300;
        } else {
            this.overdrawAmount = overdrawAmount;
        }
    }

    public CurrentAccount(String AccountName, String AccountNumber, int overdrawAmount) {
        super(AccountName, AccountNumber);
        setOverdrawAmount(overdrawAmount);
    }

    @Override
    public boolean withdraw(Float amount) {
        float fullbread = getBalance() + overdrawAmount;
        if (amount <= fullbread) {
            deductBalance(amount);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void printDetails() {
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Account id: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account type: Current " );
        System.out.println("Overdraw: " + getOverdrawAmount());

    }




}
