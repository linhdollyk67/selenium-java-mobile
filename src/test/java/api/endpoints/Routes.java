package api.endpoints;

public class Routes {
    public static String base_url = "https://rbh-rh-cs-sit-api.gcp.alp-robinhood.com/v1/rhc";
    public static String get_tripId = base_url + "/trips/upsertdraftingtrip";
    public static String create_new_job = base_url + "/bookings";
    public static String cancel_job = base_url + "/bookings/cancel-booking";
    public static String job_history = base_url + "/bookings/getbookinghistory?status=1&page=1&pageSize=12";

//    https://www.youtube.com/watch?v=tXo2vO5QNAw
}
