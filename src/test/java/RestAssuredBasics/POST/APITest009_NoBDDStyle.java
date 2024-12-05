package RestAssuredBasics.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest009_NoBDDStyle {
    @Description("Verify the POST Request - No BDD Style")
    @Test
    public void test_non_bbd_post() {

        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";


        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);
        r.when().post();
        r.then().log().all().statusCode(200);



    }



}

