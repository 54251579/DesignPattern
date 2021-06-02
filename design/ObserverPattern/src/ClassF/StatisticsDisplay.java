package ClassF;

import interfaceF.DisplayElements;
import interfaceF.Observer;
import interfaceF.Subject;

public class StatisticsDisplay implements Observer, DisplayElements{
	
	private double maxTemperature = 0.0;
	private double minTemperature = 100.0;
	private double temperatureSum = 0.0;
	private int numReadings;
	
	public StatisticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("avg/max/min = "+(temperatureSum/numReadings)+"/"+maxTemperature+"/"+minTemperature);
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		temperatureSum += temperature;
		numReadings++;
		
		if(temperature>maxTemperature) maxTemperature=temperature;
		if(temperature<minTemperature) minTemperature=temperature;
		
		display();
		
	}

}
