package main;

import ClassF.CurrentConditionsDisplay;
import ClassF.ForecastDisplay;
import ClassF.StatisticsDisplay;
import ClassF.WeatherData;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData= new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay display = new ForecastDisplay(weatherData);
		
		weatherData.setMesurements(30, 60, 30.4);
		weatherData.setMesurements(33, 50, 29.2);
		weatherData.setMesurements(28, 60, 29.2);
		weatherData.setMesurements(25, 80, 28.2);
			
	}

}
