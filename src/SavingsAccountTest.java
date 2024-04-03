
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {
    SavingsAccount Savings = new SavingsAccount( "testName", "1", 4 );

@Test
    void setRateTest(){
        BankAccount.setHighRate(10);
        BankAccount.setLowRate(3);
        Savings.setRate(4);
        Savings.printDetails();
        assertEquals(4, Savings.getRate());
        Savings.setRate(-20);
        assertEquals(3, Savings.getRate());

    }
    @Test
    void addIntrestTest(){
        BankAccount.setHighRate(10);
        BankAccount.setLowRate(3);
        Savings.setBalance(300);
        Savings.setRate(10);
        Savings.addInterest();
        assertEquals(330, Savings.getBalance());

        Savings.setBalance(300);
        Savings.setRate(1);
        Savings.addInterest();
        assertEquals(309, Savings.getBalance());

        Savings.setBalance(300);
        Savings.setRate(22);
        Savings.addInterest();
        assertEquals(330, Savings.getBalance());
    }
}

