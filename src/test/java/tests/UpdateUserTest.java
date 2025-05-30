package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserTest {
    @Test
    public void testUpdateUser() {
        given()
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"sathish\", \"job\": \"lead qa\" }")
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .body("job", equalTo("lead qa"));
    }

}
