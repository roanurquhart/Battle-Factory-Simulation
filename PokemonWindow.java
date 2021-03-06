package comp110.pokemonbattle;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PokemonWindow {

	private Stage _stage;

	private PokemonRenter _renter;

	public PokemonWindow() {
		try {

			// Notice we're constructing the ChatController with the correct
			// parameters
			// We're also making the title of the window be based on the onyen
			_renter = new PokemonRenter();
			String view = "RentalScreen.fxml";

			// Construct the FXML Loader
			FXMLLoader loader = new FXMLLoader(getClass().getResource(view));
			loader.setController(_renter);

			// Load the Scene
			Scene scene = new Scene(loader.load());

			// Setup the window
			_stage = new Stage();
			_stage.setScene(scene);
			this.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * Cause the Stage to appear (even after it's been closed!) and force it to
	 * be brought as the front window open.
	 */
	public void show() {
		_stage.show();
		_stage.toFront();
	}

}