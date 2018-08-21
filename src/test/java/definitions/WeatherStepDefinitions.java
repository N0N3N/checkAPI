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

    @Then("visibility is (.*)")
    public void check_visibility(int visibility){
        assertEquals("Wrong visibility", visibility, response.getVisibility());
    }

    @Then("speed is (.*)")
    public void check_speed(double speed){
        assertEquals("Wrong speed", speed, response.getWind().getSpeed(), 0.001);
    }

    @Then("deg is (.*)")
    public void check_deg(int deg){
        assertEquals("Wrong deg", deg, response.getWind().getDeg());
    }

    @Then("all is (.*)")
    public void check_all(int all){
        assertEquals("Wrong all", all, response.getClouds().getAll());
    }

    @Then("dt is (.*)")
    public void check_dt(int dt){
        assertEquals("Wrong dt", dt, response.getDt());
    }

    @Then("type is (.*)")
    public void check_type(int type){
        assertEquals("Wrong type", type, response.getSys().getType());
    }

    @Then("sys.id is (.*)")
    public void check_sys_id(int id){
        assertEquals("Wrong id", id, response.getSys().getId());
    }

    @Then("message is (.*)")
    public void check_message(double message){
        assertEquals("Wrong message", message, response.getSys().getMessage(), 0.001);
    }

    @Then("country is (.*)")
    public void check_country(String country){
        assertEquals("Wrong country", country, response.getSys().getCountry());
    }

    @Then("sunrise is (.*)")
    public void check_sunrise(int sunrise){
        assertEquals("Wrong sunrise", sunrise, response.getSys().getSunrise());
    }

    @Then("sunset is (.*)")
    public void check_sunset(int sunset){
        assertEquals("Wrong sunset", sunset, response.getSys().getSunset());
    }

    @Then("id is (.*)")
    public void check_id(int id){
        assertEquals("Wrong id", id, response.getId());
    }

    @Then("name is (.*)")
    public void check_name(String name){
        assertEquals("Wrong name", name, response.getName());
    }

    @Then("cod is (.*)")
    public void check_cod(int cod){
        assertEquals("Wrong cod", cod, response.getCod());
    }
}
