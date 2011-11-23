package br.com.emannuel.dd.push.manualmente;


public class WhaterStation {

	public static void main(String[] args) {
		WhaterData whaterData = new WhaterData();
		
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(whaterData);
		whaterData.setMeasurements(80, 65, 30.4f);
		conditionDisplay.display();
		
	}

}
