package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserTest {

    @Test
    public void testCreateUser() {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"sathish\", \"job\": \"qa engineer\" }")
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("sathish"))
                .body("job", equalTo("qa engineer"));
    }
}
