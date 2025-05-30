package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class DeleteUserTest {

    @Test
    public void testDeleteUser() {
        when()
                .delete("/users/2")
                .then()
                .statusCode(204);
    }

}
