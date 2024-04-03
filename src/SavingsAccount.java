public class SavingsAccount extends BankAccount{

    private float rate;
    public float getRate(){
        return rate;
    }

    public float rateCheck(float rate) {
        BankAccount.setHighRate(10.0f);
        BankAccount.setLowRate(3.0f);
        float lowRate = getLowRate();
        float highRate = getHighRate();
        System.out.println("The low rate is - "+lowRate);
        System.out.println("The High rate is - "+highRate);

        if (rate < lowRate) {
            rate = lowRate;

        } else if (rate > highRate) {
            rate = highRate;

        }
        System.out.println("The rate is - "+rate);
        return rate;
    }

    public void setRate(float rate) {
        float checkedRate=rateCheck(rate);
        this.rate = checkedRate;

    }


    public SavingsAccount(String accName, String accNumber, float rate ) {
        super(accName, accNumber);
        setRate(rate);
    }

    public void addInterest(){
        float balance = getBalance();
        float decimal = rate/100;
        float intrest = balance*decimal;
        float balanceWithIntrest = balance+intrest;
        setBalance(balanceWithIntrest);
    }


    @Override
    public void printDetails() {
        System.out.println("Account Name - "+getAccountName());
        System.out.println("Account ID - "+getAccountNumber());
        System.out.println("Account Balance - "+getBalance());
        System.out.println("Account Type - Savings");
        System.out.println("Account Rate - "+getRate());

    }
}
