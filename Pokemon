package comp110.pokemonbattle;

import java.util.Random;
import java.util.Scanner;

public class Pokemon {

	private String _name;
	private double _health;
	private double _strength;
	private int _speed;
	private double _fullHealth;
	private static double _fullerHealth;

	/**
	 * Constructs the pokemon
	 * 
	 * @Require: health is an integer greater than or equal to 1 but less than
	 *           or equal to 300 strength is and integer greater than or equal
	 *           to 1 but less than or equal to 300 speed is an integer greater
	 *           than or equal to 1 but less than or equal to 300
	 */
	public Pokemon(String name, int health, int strength, int speed) {
		assert health >= 1.0;
		assert health <= 300.0;
		assert strength >= 1;
		assert strength <= 300;
		assert speed >= 1;
		assert speed <= 300;

		_fullHealth = health;
		_fullerHealth = health;
		_name = name;
		_health = health;
		_strength = strength;
		_speed = speed;
	}

	public static void battle(Pokemon a, Pokemon b) {
		while (a.getHealth() > 0 && b.getHealth() > 0) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Which attack would you like to use? 1 or 2?");
			int n = reader.nextInt();
			if (n == 1) {
				Pokemon.attack1(a, b);
			} else if (n == 2) {
				Pokemon.attack2(a, b);
			}
		}
		if (b.getHealth() <= 0 && a.getHealth() > 0) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");
		}
	}

	public static void attack1(Pokemon a, Pokemon b) {
		if (a.getSpeed() > b.getSpeed()) {
			System.out.println(a.getName() + " uses *attack*");
			double remain = b.getHealth() - a.getStrength();
			System.out.println(a.getName() + " does " + a.getStrength() + " damage to " + b.getName());
			b.setHealth(remain);
			System.out.println(b.getName() + " has " + remain + " health remaining");

			Random rand = new Random();
			int n = rand.nextInt(100) + 1;
			if (b.getHealth() > 0) {
				System.out.println(b.getName() + " uses *attack*");
				if (n < 5) {
					System.out.println(b.getName() + " does " + a.getHealth() + " damage to " + a.getName());
					a.setHealth(0);
				} else if (n > 6 && n < 31) {
					System.out
							.println(b.getName() + " does " + (a.getFullHealth() * .75) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() * .75);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				} else if (n >= 31 && n < 71) {
					System.out.println(b.getName() + " does " + (a.getFullHealth() / 2) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() / 2);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				} else if (n >= 71 && n <= 100) {
					System.out
							.println(b.getName() + " does " + (a.getFullHealth() * .25) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() * .25);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				}
			}
		} else {
			Random rand = new Random();
			int n = rand.nextInt(100) + 1;
			if (b.getHealth() > 0) {
				System.out.println(b.getName() + " uses *attack*");
				if (n < 5) {
					System.out.println(b.getName() + " does " + a.getHealth() + " damage to " + a.getName());
					a.setHealth(0);
				} else if (n > 6 && n < 31) {
					System.out
							.println(b.getName() + " does " + (a.getFullHealth() * .75) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() * .75);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				} else if (n >= 31 && n < 71) {
					System.out.println(b.getName() + " does " + (a.getFullHealth() / 2) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() / 2);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				} else if (n >= 71 && n <= 100) {
					System.out
							.println(b.getName() + " does " + (a.getFullHealth() * .25) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() * .25);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				}
			}
			if (a.getHealth() > 0) {
				System.out.println(a.getName() + " uses *attack*");
				double remain2 = b.getHealth() - a.getStrength();
				System.out.println(a.getName() + " does " + a.getStrength() + " damage to " + b.getName());
				b.setHealth(remain2);
				System.out.println(b.getName() + " has " + remain2 + " health remaining");
			}
		}

		if (a.getHealth() <= 0) {
			System.out.println(a.getName() + " fainted");
		}
		if (b.getHealth() <= 0) {
			System.out.println(b.getName() + " fainted");
		}
	}

	public static void attack2(Pokemon a, Pokemon b) {
		if (a.getSpeed() > b.getSpeed()) {
			System.out.println(a.getName() + " uses *attack*");
			System.out.println(a.getName() + " does " + (a.getStrength() * .25) + " damage to " + b.getName());
			System.out.println(a.getName() + " lowers " + b.getName() + "'s" + " speed");
			b.setSpeed(b.getSpeed() / 2);
			b.setHealth(b.getHealth() - (a.getStrength() * .25));
			System.out.println(b.getName() + " has " + b.getHealth() + " health remaining");
			if (b.getHealth() > 0) {
				Random rand = new Random();
				int n = rand.nextInt(100) + 1;
				System.out.println(b.getName() + " uses *attack*");
				if (n < 5) {
					System.out.println(b.getName() + " does " + a.getHealth() + " damage to " + a.getName());
					a.setHealth(0);
				} else if (n > 6 && n < 31) {
					System.out
							.println(b.getName() + " does " + (a.getFullHealth() * .75) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() * .75);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				} else if (n >= 31 && n < 71) {
					System.out.println(b.getName() + " does " + (a.getFullHealth() / 2) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - (a.getFullHealth() / 2));
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				} else if (n >= 71 && n <= 100) {
					System.out
							.println(b.getName() + " does " + (a.getFullHealth() * .25) + " damage to " + a.getName());
					a.setHealth(a.getHealth() - a.getFullHealth() * .25);
					System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
				}
			}
		} else {
			Random rand = new Random();
			int n = rand.nextInt(100) + 1;
			System.out.println(b.getName() + " uses *attack*");
			if (n < 5) {
				System.out.println(b.getName() + " does " + a.getHealth() + " damage to " + a.getName());
				a.setHealth(0);
			} else if (n > 6 && n < 31) {
				System.out.println(b.getName() + " does " + (a.getFullHealth() * .75) + " damage to " + a.getName());
				a.setHealth(a.getHealth() - a.getFullHealth() * .75);
				System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
			} else if (n >= 31 && n < 71) {
				System.out.println(b.getName() + " does " + (a.getFullHealth() / 2) + " damage to " + a.getName());
				a.setHealth(a.getHealth() - a.getFullHealth() / 2);
				System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
			} else if (n >= 71 && n <= 100) {
				System.out.println(b.getName() + " does " + (a.getFullHealth() * .25) + " damage to " + a.getName());
				a.setHealth(a.getHealth() - a.getFullHealth() * .25);
				System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");
			}
			System.out.println(a.getName() + " uses *attack*");
			System.out.println(a.getName() + " does " + (a.getStrength() * .25) + " damage to " + b.getName());
			b.setHealth(b.getHealth() - (a.getStrength() * .25));
			System.out.println(b.getName() + " has " + b.getHealth() + " health remaining");
		}

		if (a.getHealth() <= 0) {
			System.out.println(a.getName() + " fainted");
		}
		if (b.getHealth() <= 0) {
			System.out.println(b.getName() + " fainted");
		}
	}

	public int getSpeed() {
		return _speed;
	}

	public void setSpeed(int i) {
		_speed = i;
	}

	public String getName() {
		return _name;
	}

	public double getStrength() {
		return _strength;
	}

	public double getHealth() {
		return _health;
	}

	public void setHealth(double health) {
		_health = health;
	}

	public double getFullHealth() {
		return _fullHealth;
	}

	public static double getFullHealth2() {
		return _fullerHealth;
	}

	public void healthReset() {
		_health = this.getFullHealth();
	}
}
