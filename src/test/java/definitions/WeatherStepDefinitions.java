package definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import org.junit.Assert;

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
        assertEquals("Wrong LON", lon, response.getCoord().getLon(),0.001);
    }

    @Then("lat is (.*)")
    public void check_lat(double lat) {
        assertEquals("Wrong LAT", lat, response.getCoord().getLat(), 0.001);
    }

    @Then("weather.id is (.*)")
    public void check_weaterId(int id){
        assertEquals("Wrong id", id, response.getWeather().get(0).getId());
    }

    @Then("main is (.*)")
    public void check_main(String main){
        assertEquals("Wrong main", main, response.getWeather().get(0).getMain());
    }

    @Then("description is (.*)")
    public void check_description(String description){
        assertEquals("Wrong description", description, response.getWeather().get(0).getDescription());
    }

    @Then("icon is (.*)")
    public void check_icon(String icon){
        assertEquals("Wrong icon", icon, response.getWeather().get(0).getIcon());
    }

    @Then("base is (.*)")
    public void check_base(String base){
        assertEquals("Wrong base", base, response.getBase());
    }

    @Then("temp is (.*)")
    public void check_temp(double temp){
        assertEquals("Wrong temp", temp, response.getMain().getTemp(), 0.001);
    }

    @Then("pressure is (.*)")
    public void check_pressure(int pressure){
        assertEquals("Wrong pressure", pressure, response.getMain().getPressure(), 0.001);
    }


    @Then("humidity is (.*)")
    public void check_humidity(int humidity){
        assertEquals("Wrong humidity", humidity, response.getMain().getHumidity());
    }

    @Then("temp_min is (.*)")
    public void check_temp_min(double temp_min){
        assertEquals("Wrong temp_min", temp_min, response.getMain().getTempMin(), 0.001);
    }

    @Then("temp_max is (.*)")
    public void check_temp_max(double temp_max){
        assertEquals("Wrong temp_max", temp_max, response.getMain().getTempMax(), 0.001);
    }


}
