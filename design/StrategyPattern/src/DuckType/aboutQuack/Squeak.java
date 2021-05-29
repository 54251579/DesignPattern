package DuckType.aboutQuack;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("beep");
	}
	
}
