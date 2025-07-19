import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    @DisplayName("Check correct with 3 symbol")
    public void AccountCorrect3Test(){
        String name = "а а";
        Account accountCorrect3 = new Account(name);
        boolean canEmboss = accountCorrect3.checkNameToEmboss();
        Assertions.assertTrue(canEmboss);
    }

    @Test
    @DisplayName("Check correct with 19 symbol")
    public void AccountCorrect19Test(){
        String name = "Аладщкда Ааывсывацк";
        Account accountCorrect19 = new Account(name);
        boolean canEmboss = accountCorrect19.checkNameToEmboss();
        Assertions.assertTrue(canEmboss);
    }

    @Test
    @DisplayName("Check incorrect with 2 symbol")
    public void AccountIncorrect2Test(){
        String name = "вз";
        Account accountIncorrect2 = new Account(name);
        boolean canEmboss = accountIncorrect2.checkNameToEmboss();
        Assertions.assertFalse(canEmboss);
    }

    @Test
    @DisplayName("Check incorrect with 20 symbol")
    public void AccountIncorrect20Test(){
        String name = "Аладщкдай Ааывсывацк";
        Account accountIncorrect20 = new Account(name);
        boolean canEmboss = accountIncorrect20.checkNameToEmboss();
        Assertions.assertFalse(canEmboss);
    }

    @Test
    @DisplayName("Check incorrect without space")
    public void AccountIncorrectWithoutSpaceTest(){
        String name = "аааа";
        Account accountIncorrectWithoutSpace = new Account(name);
        boolean canEmboss = accountIncorrectWithoutSpace.checkNameToEmboss();
        Assertions.assertFalse(canEmboss);
    }

    @Test
    @DisplayName("Check incorrect with 2 space")
    public void AccountIncorrectWith2SpaceTest(){
        String name = "аа  аа";
        Account accountIncorrectWith2Space = new Account(name);
        boolean canEmboss = accountIncorrectWith2Space.checkNameToEmboss();
        Assertions.assertFalse(canEmboss);
    }

    @Test
    @DisplayName("Check incorrect with starts space")
    public void AccountIncorrectWithStartsSpaceTest(){
        String name = " аааа";
        Account accountIncorrectWithStartsSpace = new Account(name);
        boolean canEmboss = accountIncorrectWithStartsSpace.checkNameToEmboss();
        Assertions.assertFalse(canEmboss);
    }

    @Test
    @DisplayName("Check incorrect with ends space")
    public void AccountIncorrectWithEndsTest(){
        String name = "аааа ";
        Account accountIncorrectWithEndsSpace = new Account(name);
        boolean canEmboss = accountIncorrectWithEndsSpace.checkNameToEmboss();
        Assertions.assertFalse(canEmboss);
    }
}
