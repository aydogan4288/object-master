
public class Samurai extends Human {
	public Samurai() {
		this.health = 200;
	}
	
	public int deathBlow(Human human) {
		this.health = this.health /2;
		return human.health = 0; // Stealth level of the Samurai;
	}
	
	public int meditate() {
		int fullHealth = this.health * 2;
		return this.health = fullHealth;
	}

}
