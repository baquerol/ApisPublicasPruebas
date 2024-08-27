package test.apiPublica;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class UpdatePartiallyObject {

    @Test
    public void UpdatePartiallyObject (){
        File putBody = new File("src/main/resources/putParcial.json");

        RequestSpecification request =given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .header("Content-Type","application/json")
                .body(putBody);

        Response response =request
                .when()
                .patch("/ff80818190c0e1170190cd9a15bd1387");

        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
