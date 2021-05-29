package DuckType;

import DuckType.aboutDuck.Duck;
import DuckType.aboutDuck.MallardDuck;
import DuckType.aboutDuck.ModelDuck;
import DuckType.aboutFly.FlyNoWay;
import DuckType.aboutFly.FlyWithWings;

public class Main {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		
		model.performFly();
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
		model.setFlyBehavior(new FlyNoWay());
		model.performFly();
	}

}
