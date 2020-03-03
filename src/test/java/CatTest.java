import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void foodForCat() {

        Cat nu = new Cat();
        nu.foodForCat("Cat poo");
        Assert.assertEquals("We are expecting cat snaaks","Cat snacks", nu.getFood());
    }

}