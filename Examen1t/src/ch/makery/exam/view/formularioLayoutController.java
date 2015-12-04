package ch.makery.exam.view;

import ch.makery.exam.Main;
import javafx.fxml.FXML;

public class formularioLayoutController {
	private Main main;

	@FXML
	private void initialize() {

	}
	
	/**
	 * activa el metodo cambiarP() de main al pulsar el boton ok
	 * @see Main
	 */
	@FXML
	public void ok() {
		main.cambiarP();
	}

	/**
	 * Pasa la clase main para usarla
	 * 
	 * @param main
	 */
	public void setMain(Main main) {
		this.main = main;
	}
}
