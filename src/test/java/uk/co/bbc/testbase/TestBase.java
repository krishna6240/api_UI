package uk.co.bbc.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void init(){
        RestAssured.baseURI = "https://v6.exchangerate-api.com/v6/1fc80820c72b0163bc9c7536/latest/";
      //  RestAssured.port = 3030;

    }
}
