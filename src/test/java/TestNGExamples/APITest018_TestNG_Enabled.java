package TestNGExamples;

import org.junit.Assert;
import org.testng.annotations.Test;

public class APITest018_TestNG_Enabled {

    @Test
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(true);
    }

    @Test
    public void test03(){
        Assert.assertTrue(true);
    }

}

