package com.truesummitAPITestingFramework.setUp;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class BaseTest {

    @BeforeSuite
    public void setUp(){

        baseURI = "https://api.stripe.com";
        basePath="/v1";

    }

    @AfterSuite
    public void tearDown(){


    }

}
