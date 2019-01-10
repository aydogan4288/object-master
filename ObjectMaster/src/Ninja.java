
public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	}
	
	public int stealth(Human human) {
		int damage = this.stealth;
		return human.health -= damage; // Stealth level of the Ninja;
	}
	
	public int runAway() {
		return this.health -= 10;
	}

}
