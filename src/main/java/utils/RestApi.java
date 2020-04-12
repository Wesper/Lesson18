package utils;

import static io.restassured.RestAssured.given;
import static utils.DriverManager.getDriver;
import static utils.DriverManager.getUrl;

public class RestApi {

    private static String sessionId = getDriver().getSessionId().toString();
    private static String url = getUrl();

    public static void lockDevice(){
        given().
                contentType("text/plain").
        when().
                post(url + "/session/" + sessionId + "/appium/device/lock").
        then().
                statusCode(200);
    }

    public static void unlockDevice(){
        given().
                contentType("text/plain").
        when().
                post(url + "/session/" + sessionId + "/appium/device/unlock").
        then().
                statusCode(200);
    }

    public static void backgroundApp(int sec){
        given().
                contentType("application/json").
                body("{\"seconds\":" + sec + "}").
        when().
                post(url + "/session/" + sessionId + "/appium/app/background");
    }

    public static void launchApp(){
        given().
                contentType("text/plain").
                body("{}").
        when().
                post(url + "/session/" + sessionId + "/appium/app/launch");
    }
}
