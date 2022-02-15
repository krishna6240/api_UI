package uk.co.bbc.currencytest;

import io.restassured.response.Response;
import org.junit.Test;
import uk.co.bbc.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class currencytest extends TestBase {
    @Test
    public void getallcurrencyInfo(){
        Response response =
                given()
                        .basePath("/USD")
                        .when()
                        .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getTotalNumberOfCurrency(){
        //conversion_rates
        Response response =
                given()
                        .basePath("/conversion_rates")
                        .when()
                        .get();
        response.then().statusCode(404);
        response.prettyPrint();
    }
    @Test
    public void currencyGBP(){
        //conversion_rates.GBP
       /* String name = response.extract().path("conversion_rates.GBP");
        System.out.println("Name of the store is :"+name);*/
        Response response =
                given()
                        .basePath("/GBP")
                        .when()
                        .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
