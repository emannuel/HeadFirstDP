package br.com.emannuel.dd.pull.observable;

import java.util.Observable;

public class WhaterData extends Observable{

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WhaterData() {
	}
	
	public void measurementsChanged() { 
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
