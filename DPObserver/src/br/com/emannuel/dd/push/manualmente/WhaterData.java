package br.com.emannuel.dd.push.manualmente;

import java.util.ArrayList;

public class WhaterData implements Subject {

	private ArrayList<Object> listeners;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WhaterData() {
		listeners = new ArrayList<Object>();
	}
	
	
	@Override
	public void addListener(WhaterListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeListener(WhaterListener listener) {
		int i = listeners.indexOf(listener);
		if (i >= 0) {
			listeners.remove(listener);
		}
	}

	@Override
	public void notifyListeners() {
		for (Object listener : listeners) {
			((WhaterListener) listener).update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyListeners();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
}
