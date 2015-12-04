package ch.makery.exam.view;

import ch.makery.exam.Main;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class RootLayoutController {
	private Main main;
	
	
	
	@FXML
	private void initialize() {
	
	}
	/**
	 * activa el metodo cambiar() de main al pulsar la imagen de enviar
	 * @see Main
	 */
	@FXML
	private void pulsar(){
		main.cambiar();
	}
	/**
	 * Pasa la clase main para usarla
	 * @param main
	 */
	public void setMain(Main main) {
		this.main = main;
		
	}
	

}
