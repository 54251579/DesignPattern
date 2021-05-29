package DuckType.aboutDuck;

import DuckType.aboutFly.FlyBehavior;
import DuckType.aboutQuack.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("duck floats on water");
	}
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
