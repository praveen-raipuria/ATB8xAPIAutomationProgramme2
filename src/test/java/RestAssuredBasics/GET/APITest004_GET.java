package RestAssuredBasics.GET;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest004_GET {
    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(String param1){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        APITest004_GET np = new APITest004_GET();
        np.step1();
        np.step2();
        np.step3("Pramod");

        //np.step1().step2().step3("pramod");
    }

    public static class APITest006_NoBDDStyle {

        static RequestSpecification r = RestAssured.given();

        @Description("TC1 - NonBDDStyleGET - Positive Testcase")
        @Test
        public void test_NonBDDStyleGET_positive(){
            r.baseUri("https://api.zippopotam.us");
            r.basePath("/IN/388620");
            r.when().log().all().get();
            r.then().log().all().statusCode(200);
        }

        @Description("TC2 - NonBDDStyleGET - Negative Testcase")
        @Test
        public void test_NonBDDStyleGET_negative(){
            RequestSpecification r = RestAssured.given();
            r.baseUri("https://api.zippopotam.us");
            r.basePath("/IN/-1");
            r.when().log().all().get();
            r.then().log().all().statusCode(404);
        }




    }

    public static class APITest005_BDDStyleGET {
        @Test
        public void test_GET_Req_POSITIVE() {

            String pin_code =  "388620";
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pin_code)
                    .when()
                    .log()
                    .all()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(200);


        }

        @Test
        public void test_GET_Req_NEGATIVE() {

            String pin_code =  "-1";
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pin_code)
                    .when()
                    .log()
                    .all()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(200);


        }


    }
}

