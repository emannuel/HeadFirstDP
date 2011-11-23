package br.com.emannuel.dd.push.manualmente;

import br.com.emannuel.dd.DisplayElement;

public class CurrentConditionDisplay implements WhaterListener, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject whaterData;
	
	public CurrentConditionDisplay(Subject whaterData) {
		this.whaterData = whaterData;
		this.whaterData.addListener(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions " + temperature + "F degrees and " 
				+ "humidity " + "% " + humidity
				+ " head index %	 " + temperature * humidity / 100);
		
	}
}
