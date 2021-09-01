package com.truesummit.APITestingFramework.testcases;

import com.truesummitAPITestingFramework.setUp.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class CreateCustomerTest extends BaseTest {


    @Test
    public void validateCreateCustomerAPIWithValidSecretKey() {

        Response stripeResponse = given().auth().basic("sk_test_51IzhOcIzTEjKT1iiyAAM0oruNws3z7WL3BF2KWPteyfh7oBt3qk8c1wWesTrweMwSztHmpicW6sIgG3auiYrWZML00Tstfl7os", "")
                .formParams("email", "user1@gmail.com")
                .formParams("description", "Adding first customer in framework")
                .post("/customers");

        stripeResponse.prettyPrint();
        System.out.println(stripeResponse.statusCode());
    }
        @Test
        public void validateCreateCustomerAPIWithInValidSecretKey(){

            Response stripeResponse=given().auth().basic("11111sk_test_51IzhOcIzTEjKT1iiyAAM0oruNws3z7WL3BF2KWPteyfh7oBt3qk8c1wWesTrweMwSztHmpicW6sIgG3auiYrWZML00Tstfl7os","")
                    .formParams("email","user1@gmail.com")
                    .formParams("description","Adding first customer in framework")
                    .post("/customers");

            stripeResponse.prettyPrint();
            System.out.println(stripeResponse.statusCode());



    }

}
