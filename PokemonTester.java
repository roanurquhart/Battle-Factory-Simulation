package comp110.pokemonbattle;

import comp110.pokemonbattle.PokemonRenter;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;

// Name: Roan Urquhart
// Onyen: roanroan

public class PokemonTester {
	private Scene _scene;
	private PokemonRenter _renter;
	private static Stage _stage;

	public static void main(String[] args) {
		int n = 1;
		while (n == 1) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Would you like to battle? Type 1 for yes and 2 for no");
			n = reader.nextInt();
			int i = 0;
			while (n == 1) {
				// PokemonRenter.rentablePokemon();

				Pokemon.battle(PokemonRenter.reRent(), PokemonRenter.shuffler());
				if (i > 0) {
					Scanner reader2 = new Scanner(System.in);
					System.out.println("Would you like to battle again? Type 1 for yes and 2 for no");
					n = reader.nextInt();
				}
				i++;
			}
		}
		System.out.println("Thanks for playing!");
	}

}
