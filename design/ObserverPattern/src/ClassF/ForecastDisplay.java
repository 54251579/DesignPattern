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
		System.out.print("�ϱ⿹��: ");
		if(currentPressure > lastpressure) System.out.println("������ ������ �����Դϴ�");
		else if(currentPressure < lastpressure) System.out.println("�� �� �����Դϴ�");
		else System.out.println("��ȭ�� ���� ���� �����Դϴ�");
		
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		lastpressure = currentPressure;
		currentPressure = pressure;
		display();
		
	}
	
}
