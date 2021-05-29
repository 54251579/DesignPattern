package DuckType.aboutDuck;

import DuckType.aboutFly.FlyWithWings;
import DuckType.aboutQuack.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm Mallar duck");
	}
	
}
