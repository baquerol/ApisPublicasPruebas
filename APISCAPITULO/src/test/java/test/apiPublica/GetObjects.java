package test.apiPublica;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetObjects {

    @Test
    public void getObjects (){
        RequestSpecification request =given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects");
        Response response =request
                .when()
                .get();

        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
