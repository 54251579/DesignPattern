package SimpleRole;


import SimpleRole.Role.Role;
import SimpleRole.WeaponType.HandBehavior;
import SimpleRole.WeaponType.WeaponBehavior;

public class Character {
	WeaponBehavior weaponBehavior;
	Role role;
	
	public Character(Role role) {
		this.role = role;
		weaponBehavior = new HandBehavior();
	}
	
	public void useWeapon(){
		weaponBehavior.useWeapon();
	}
	public void fight() {
		role.fight();
	}
	
	
	public WeaponBehavior getWeaponBehavior() {
		return weaponBehavior;
	}

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
}
