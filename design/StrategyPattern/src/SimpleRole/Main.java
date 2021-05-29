package SimpleRole;

import SimpleRole.Role.King;
import SimpleRole.WeaponType.AxeBehavior;

public class Main {

	public static void main(String[] args) {
		Character character = new Character(new King());
		character.fight();
		character.useWeapon();
		character.setWeaponBehavior(new AxeBehavior());
		character.useWeapon();
	}

}
