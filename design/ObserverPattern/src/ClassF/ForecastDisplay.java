package ClassF;

import interfaceF.DisplayElements;
import interfaceF.Observer;
import interfaceF.Subject;

public class ForecastDisplay implements Observer, DisplayElements{

	private double currentPressure = 29.92;
	private double lastpressure;
	
	public ForecastDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.print("일기예보: ");
		if(currentPressure > lastpressure) System.out.println("날씨가 좋아질 에정입니다");
		else if(currentPressure < lastpressure) System.out.println("비가 올 에정입니다");
		else System.out.println("변화가 거의 없을 에정입니다");
		
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		lastpressure = currentPressure;
		currentPressure = pressure;
		display();
		
	}
	
}
