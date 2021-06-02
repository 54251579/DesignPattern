package ClassF;

import java.util.ArrayList;

import interfaceF.Observer;
import interfaceF.Subject;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) observers.remove(i);
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers) o.update(temperature, humidity, pressure);
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	// 수동 테스트
	public void setMesurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
	
}
