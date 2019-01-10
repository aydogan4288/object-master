
public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public int heal(Human human) {
		int healed = this.intelligence;
		return human.health += healed; // wizard's intelligence!
	}
	
	public int fireball(Human human) {
		int damage = this.intelligence * 3;
		return human.health -= damage; // 3 * wizard's intelligence!
	}
}
