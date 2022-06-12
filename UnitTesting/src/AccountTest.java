import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

@Test
    public void creditScoreTooLowTest(){
        Customer c1 = new Customer("Nancy",30,0.4);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.00,a1.getInterest());
    }
@Test
    public void creditScoreHighOldestTest(){
        Customer c1 = new Customer("Nancy",36,1);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.31,a1.getInterest());
    }
@Test
    public void creditScoreHighOlderTest(){
        Customer c1 = new Customer("Nancy",26,1);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.21,a1.getInterest());
    }
@Test
    public void creditScoreHighYoungerTest(){
        Customer c1 = new Customer("Nancy",20,1);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.11,a1.getInterest());
    }
@Test
    public void creditScoreHighYoungestTest(){
        Customer c1 = new Customer("Nancy",16,1);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.00,a1.getInterest());
    }
@Test
    public void creditScoreMediumOldestTest(){
        Customer c1 = new Customer("Nancy",36,0.8);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.10,a1.getInterest());
    }
@Test
    public void creditScoreMediumOldTest(){
        Customer c1 = new Customer("Nancy",26,0.8);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.09,a1.getInterest());
    }
@Test
    public void creditScoreMediumYoungerTest(){
        Customer c1 = new Customer("Nancy",20,0.8);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.08,a1.getInterest());
    }

@Test
    public void creditScoreMediumYoungestTest(){
        Customer c1 = new Customer("Nancy",16,0.8);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.00,a1.getInterest());
    }

}
