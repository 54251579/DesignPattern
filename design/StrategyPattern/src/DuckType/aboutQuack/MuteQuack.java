package DuckType.aboutQuack;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("mute mute");
	}
	
}
