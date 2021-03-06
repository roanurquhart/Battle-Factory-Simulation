package comp110.pokemonbattle;

import java.util.Random;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PokemonRenter {

	@FXML
	private Button _button1, _button2, _button3;
	// private Scene _scene;

	public PokemonRenter() {

	}

	static Pokemon charizard = new Pokemon("Charizard", 55, 50, 7);
	static Pokemon blastoise = new Pokemon("Blastoise", 70, 40, 5);
	static Pokemon venusaur = new Pokemon("Venusaur", 80, 30, 3);
	static Pokemon ninetails = new Pokemon("Ninetails", 60, 35, 6);
	static Pokemon wigglytuff = new Pokemon("Wigglytuff", 100, 25, 4);
	static Pokemon arcanine = new Pokemon("Arcanine", 65, 40, 6);
	static Pokemon dragonite = new Pokemon("Dragonite", 75, 65, 5);
	static Pokemon[] pokemons = new Pokemon[3];
	static Pokemon[] pokemonsCopy = new Pokemon[3];

	public static Pokemon[] rentablePokemon() {
		for (int i = 0; i < pokemons.length; i++) {
			if (i == 0) {
				pokemons[i] = PokemonRenter.shufflePokemon1();
			} else if (i == 1) {
				pokemons[i] = PokemonRenter.shufflePokemon2();
			} else if (i == 2) {
				pokemons[i] = PokemonRenter.shufflePokemon3();
			}
			System.out.println((i + 1) + ": " + pokemons[i].getName());
		}
		return pokemons;
	}

	public static Pokemon rent() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Which Pokemon would you like to use? 1, 2, or 3?");
		int n = reader.nextInt();
		return pokemons[n - 1];
	}

	public static Pokemon shufflePokemon1() {
		Random rand = new Random();
		int n = rand.nextInt(2) + 1;
		if (n == 1) {
			return charizard;
		} else {
			return blastoise;
		}
	}

	public static Pokemon shufflePokemon2() {
		Random rand = new Random();
		int n = rand.nextInt(2) + 1;
		if (n == 1) {
			return venusaur;
		} else {
			return ninetails;
		}
	}

	public static Pokemon shufflePokemon3() {
		Random rand = new Random();
		int n = rand.nextInt(2) + 1;
		if (n == 1) {
			return wigglytuff;
		} else {
			return arcanine;
		}
	}

	public static Pokemon shuffler() {
		Random rand = new Random();
		int n = rand.nextInt(2) + 0;
		PokemonRenter.shufflePokemonArray();
		return pokemons[n];
	}

	// public void start(Stage stage) {
	// stage.setTitle("My JavaFX Application");
	// stage.setScene(_scene);
	// stage.show();
	// }

	public static Pokemon[] shufflePokemonArray() {
		for (int i = 0; i < pokemons.length; i++) {
			if (i == 0) {
				pokemons[i] = PokemonRenter.shufflePokemon1();
			} else if (i == 1) {
				pokemons[i] = PokemonRenter.shufflePokemon2();
			} else if (i == 2) {
				pokemons[i] = PokemonRenter.shufflePokemon3();
			}
		}
		return pokemons;
	}

	public static Pokemon reRent() {
		System.out.println("Rent a new Pokemon");
		PokemonRenter.rentablePokemon();
		return PokemonRenter.rent();

	}

	public static Pokemon getPokemons() {
		Scanner reader = new Scanner(System.in);
		for (int i = 0; i < pokemonsCopy.length; i++) {
			System.out.println((i + 1) + ": " + pokemonsCopy[i].getName());
		}
		System.out.println("Which Pokemon would you like to use? 1, 2, or 3?");
		int n = reader.nextInt();
		return pokemonsCopy[n - 1];
	}

}
