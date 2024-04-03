import java.util.ArrayList;
import java.util.HashMap;
public class Bank {

    HashMap<String, BankAccount> idAccountMap = new HashMap<>();
    ArrayList<String> IDList = new ArrayList<>();

    public Bank(HashMap<String, BankAccount> idAccountMap, ArrayList<String> IDList) {
        this.idAccountMap = idAccountMap;
        this.IDList = IDList;
    }

    public void addAccount(String ID, BankAccount Account) {
        idAccountMap.put(ID, Account);
        IDList.add(ID);
    }

    public void removeAccount(String ID) {
        idAccountMap.remove(ID);
        for (int index = 0; index < IDList.size(); index++) {

            if (IDList.get(index) == ID) {
                IDList.remove(index);
                break;
            }
        }
    }

    public void printAllAccounts() {
        for (int index = 0; index < IDList.size(); index++) {
            BankAccount Account = idAccountMap.get(IDList.get(index));
            Account.printDetails();
        }
    }

    public void printSavingsAccounts() {
        for (int index = 0; index < IDList.size(); index++) {
            BankAccount Account = idAccountMap.get(IDList.get(index));
            if (Account instanceof SavingsAccount) {
                Account.printDetails();
            }

        }

    }
    public void printCurrentAccounts() {
        for (int index = 0; index < IDList.size(); index++) {
            BankAccount Account = idAccountMap.get(IDList.get(index));
            if (Account instanceof CurrentAccount) {
                Account.printDetails();
            }

        }

    }

}






