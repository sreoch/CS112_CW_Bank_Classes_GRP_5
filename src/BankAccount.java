public abstract class BankAccount {

    private static float lowRate;
    private static float highRate;
    private float balance;
    private String accountName;
    private String accountNumber;

    public BankAccount(String name, String number) {
        this.accountName = name;
        this.accountNumber = number;
    }

    public static float getLowRate() {
        return lowRate;
    }

    public static float getHighRate() {
        return highRate;
    }

    public static void setLowRate(float rate) {
        if (rate < 0) {
            BankAccount.lowRate = 0;
        } else if (rate > BankAccount.highRate) {
            BankAccount.lowRate = BankAccount.highRate;
        } else {
            BankAccount.lowRate = rate;
        }
    }

    public static void setHighRate(float rate) {
        if (rate > 0) {
            BankAccount.highRate = 10;
        } else if (rate < BankAccount.lowRate) {
            BankAccount.highRate = BankAccount.lowRate;
        } else {
            BankAccount.lowRate = rate;
        }
    }

    public float getBalance() {
        return balance;
    }

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
