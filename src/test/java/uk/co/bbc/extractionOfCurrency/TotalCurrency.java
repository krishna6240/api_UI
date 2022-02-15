package uk.co.bbc.extractionOfCurrency;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.emptyIterable;
import static org.hamcrest.Matchers.equalTo;

public class TotalCurrency {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://v6.exchangerate-api.com/v6/1fc80820c72b0163bc9c7536/latest/";
        response = given()
                .when()
                .get("/USD")
                .then();
    }

    // Extract the total
    @Test
    public void test001() {
        response.extract().path("conversion_rate");
       //System.out.println("the total count of " + count);
    }

    @Test
    public void test002() {
        response.extract().path("conversion_rates.GBP");
        //System.out.println("the total is : "+total);
    }


}
