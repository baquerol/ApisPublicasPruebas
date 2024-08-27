package test.apiPublica;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSingleObject {

    @Test
    public void getSingleObject (){
        RequestSpecification request =given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects");
        Response response =request
                .when()
                .get("/3");
               // .get("/ff80818190c0e1170190cd9a15bd1387");

        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);

    }
}