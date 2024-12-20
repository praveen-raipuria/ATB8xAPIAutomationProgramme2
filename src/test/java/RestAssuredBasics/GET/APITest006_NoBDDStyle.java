package RestAssuredBasics.GET;


import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest006_NoBDDStyle {

    static  RequestSpecification r = RestAssured.given();

    @Description("TC1 - NoBDDStyleGET - Positive Testcase")
    @Test
    public void test_NoBDDStyleGET_positive(){
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/388620");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Description("TC2 - NoBDDStyleGET - Negative Testcase")
    @Test
    public void test_NoBDDStyleGET_negative(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }}



