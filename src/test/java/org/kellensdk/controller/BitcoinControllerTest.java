package org.kellensdk.controller;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
class BitcoinControllerTest {

    @Test
    public void shouldReturnHttpCode200WhenRequestedTest(){
        RestAssured.given().get("/bitcoins").then().statusCode(200);
    }
}