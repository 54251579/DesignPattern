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
		System.out.println("���� �µ�: "+ temperature);
		System.out.println("���� ����: "+ humidity);
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		display();
		
	}

}
