package definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;

import static org.junit.Assert.assertEquals;


public class WeatherStepDefinitions {

    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;

    @When("we getting weather from server")
    public void get_weather() {
        response = weatherRequester.getWeather();
    }

    @Then("lon is (.*)")
    public void check_lon(double lon) {
        assertEquals("Wrong LON", lon, response.getCoord().getLon());
    }

    @Then("lat is (.*)")
    public void check_lat(double lat) {
        assertEquals("Wrong LAT", lat, response.getCoord().getLat());
    }
}
