import java.util.Random;

/*
 * Represents a monster
 */
public class Monster {
	private String name, sprite;
	private int health, bullets, shield;
	private int startingHealth = health;
	private int maxBullets;
	
	private int defense, attack;

	public Monster(String n, int h, int b, int s, String spr) {
		name = n;
		health = h;
		maxBullets = b;
		bullets = 0;
		shield = s;
		sprite = spr;
		
		//defaults
		defense = 5;
		attack = 3;
	}

	public int action() {
		Random r = new Random();
		int random = r.nextInt(3) + 1;
		// Chooses actions
		// 1 is shoot, 2 is reload, 3 is shield
		if (bullets == 0)
			return 2;
		else if (random == 2 && bullets == maxBullets)
			return 1;
		else
			return random;
	}
	
	public int getAttack(){
		return attack;
	}
	public int getDefense(){
		return defense;
	}
	
	public void setAttack(int att){
		attack = att;
	}
	public void setDefense(int def){
		defense = def;
	}
	public void setBullets(int bull){
		bullets+= bull;
	}

}
