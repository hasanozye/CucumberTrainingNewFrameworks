package diger.runOrder;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseRunner extends AbstractTestNGCucumberTests {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("TestNG @BeforeSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("TestNG @BeforeTest");

    }



    @AfterTest
    public void afterTest(){
        System.out.println("TestNG @AfterTest");

    }



    @AfterSuite
    public void afterSuite(){
        System.out.println("TestNG @AfterSuite");

    }

}
