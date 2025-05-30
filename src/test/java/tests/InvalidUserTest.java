package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class InvalidUserTest {

    @Test
    public void testUserNotFound() {
        given()
                .when()
                .get("/users/999")
                .then()
                .statusCode(404);
    }

}
