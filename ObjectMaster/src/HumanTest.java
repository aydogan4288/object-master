
public class HumanTest {

	public static void main(String[] args) {
		
		Human h = new Human();
		Wizard w = new Wizard();
		Ninja n = new Ninja();
		Samurai s = new Samurai();
		
		System.out.println("Human attacks wizard: " + h.attack(w));
		System.out.println("Wizard attacks human: " + w.fireball(h));
		System.out.println("Ninja attacks human: " + n.stealth(h));
		System.out.println("Samurai attacks human: " + s.deathBlow(h));
		
		
		System.out.println("Human intelligence: " + h.intelligence);
		System.out.println("Wizard Intelligence: " + w.intelligence);
		System.out.println("Ninja stealth : " + n.stealth);
		System.out.println("Samurai health : " + s.health);
		
		System.out.println("Samurai meditates: " + s.meditate());
	}

}
