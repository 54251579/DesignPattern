package DuckType.aboutDuck;

import DuckType.aboutFly.FlyNoWay;
import DuckType.aboutQuack.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm Model Duck");		
	}

}
