import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {
    CurrentAccount ca = new CurrentAccount("testAccount","123456",100);

@Test
    void setOverdrawAmount() {
        ca.setOverdrawAmount(500);
        assertEquals(300, ca.getOverdrawAmount());

        ca.setOverdrawAmount(-200);
        assertEquals(0, ca.getOverdrawAmount());

        ca.setOverdrawAmount(200);
        assertEquals(200, ca.getOverdrawAmount());

    }
@Test
    void withdraw() {
    ca.setOverdrawAmount(500);
    assertTrue(ca.withdraw(Float.valueOf(100)));

    ca.setOverdrawAmount(150);
    assertFalse(ca.withdraw(Float.valueOf(200)));

    ca.setOverdrawAmount(150);
    assertFalse(ca.withdraw(Float.valueOf(150)));


}

}