package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontEndDeveloperTest {
    @Test
    public void dev(){

        FrontEndDeveloper frontDev = new FrontEndDeveloper();

/*Hello sir. I could not think of a way to test this, but I have something here.*/
        Assert.assertEquals(null, frontDev.develop());
    }

}