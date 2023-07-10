package api.endpoints;

import api.payloads.Booking;
import api.payloads.Cancel;
import api.payloads.TripID;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class sendRequest {
    public static Response genTripID(TripID payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .get(Routes.get_tripId);
        return response;

    }
    public static Response createNewTrip(Booking payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .get(Routes.create_new_job);
        return response;

    }
    public static Response cancelTrip(Cancel payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .get(Routes.cancel_job);
        return response;

    }
}
