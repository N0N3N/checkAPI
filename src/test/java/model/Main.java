package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Main{

	@JsonProperty("temp")
	private double temp;

	@JsonProperty("temp_min")
	private double tempMin;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure")
	private int pressure;

	@JsonProperty("temp_max")
	private double tempMax;

	public void setTemp(double temp){
		this.temp = temp;
	}

	public double getTemp(){
		return temp;
	}

	public void setTempMin(double tempMin){
		this.tempMin = tempMin;
	}

	public double getTempMin(){
		return tempMin;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setPressure(int pressure){
		this.pressure = pressure;
	}

	public int getPressure(){
		return pressure;
	}

	public void setTempMax(double tempMax){
		this.tempMax = tempMax;
	}

	public double getTempMax(){
		return tempMax;
	}
}