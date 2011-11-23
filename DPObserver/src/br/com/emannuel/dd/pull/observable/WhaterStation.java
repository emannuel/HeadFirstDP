package br.com.emannuel.dd.pull.observable;


public class WhaterStation {

	public static void main(String[] args) {
		
		WhaterData wd = new WhaterData();
		wd.addObserver(new CurrentConditionDisplay());
		
		wd.setMeasurements(80, 65, 30.4f);
		
	}

}
