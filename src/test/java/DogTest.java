import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void colorOfDog() {

        Dog d = new Dog();
        d.colorOfDog("Brown");
        Assert.assertEquals("We are expecting Brown","Brown", d.getFood());
    }


}