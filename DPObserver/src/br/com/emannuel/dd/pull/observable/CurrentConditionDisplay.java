package br.com.emannuel.dd.pull.observable;

import java.util.Observable;
import java.util.Observer;

import br.com.emannuel.dd.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WhaterData) {
			WhaterData wd = (WhaterData) o;
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println("Current conditions " + temperature + "F degrees and " 
				+ "humidity " + "% " + humidity
				+ " head index %	 " + temperature * humidity / 100);
	}

}
