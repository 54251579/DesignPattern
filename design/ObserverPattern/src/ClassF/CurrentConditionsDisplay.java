package ClassF;

import interfaceF.DisplayElements;
import interfaceF.Observer;
import interfaceF.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElements {
	
	private Subject weatherData;
	private double temperature;
	private double humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("현재 온도: "+ temperature);
		System.out.println("현재 습도: "+ humidity);
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		display();
		
	}

}
