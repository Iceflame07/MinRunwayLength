package Thing.Akkount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    public void findAccountName() {
        Account account = new Account("Chibuike", "Elisha", 1997);
        Account account2 = new Account("Peter", "Obi", 1001);
        assertEquals(account, account2);
        assertTrue(account.equals(account2));
    };

    @Test
    public void findAccountNumber(){
        Account account = new Account(String "accountNumber");
        assertEquals(account.getAccountNumber(), "accountNumber");
        assertTrue(account.equals(account));
    };

    @Test
    public void testForAccountPinCode(){
        Account account = new Account(String "PinCode");
        assertEquals(account.getPinCode(), "PinCode");
        assertTrue(account.equals(account));
    };

    @Test
    public void testForAccountBalance(){

    };
};
