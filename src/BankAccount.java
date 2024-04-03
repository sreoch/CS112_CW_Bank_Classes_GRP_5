public abstract class BankAccount {

    private static float lowRate;
    private static float highRate;
    private float balance;
    private String accountName;
    private String accountNumber;

    public BankAccount(String accName, String accNumber) {
        this.accountName = accName;
        this.accountNumber = accNumber;
    }

    public static float getLowRate() {
        return lowRate;
    }

    public static float getHighRate() {
        return highRate;
    }

    public static void setLowRate(float lowRate) {
        if (lowRate < 0) {
            BankAccount.lowRate = 0;
        } else if (lowRate > BankAccount.highRate) {
            BankAccount.lowRate = BankAccount.highRate;
        } else {
            BankAccount.lowRate = lowRate;
        }
    }

    public static void setHighRate(float highRate) {
        if (highRate >= 10) {
            BankAccount.highRate = 10;
        } else if (highRate < BankAccount.lowRate) {
            BankAccount.highRate = BankAccount.lowRate;
        } else {
            BankAccount.lowRate = highRate;
        }
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance){ this.balance = balance;}

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String name) {
        this.accountName = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public abstract void printDetails();

    public void deductBalance(Float amount) {
        this.balance -= amount;
    }

    public boolean withdraw(Float amount) {
        if (amount <= getBalance()) {
            deductBalance(amount);
            return true;
        } else {
            return false;
        }
    }
}
