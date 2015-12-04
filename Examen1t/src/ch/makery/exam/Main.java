package ch.makery.exam;
	
import java.io.IOException;


import ch.makery.exam.view.RootLayoutController;
import ch.makery.exam.view.formularioLayoutController;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
/**
 * Aplicacion muy chula
 * @author pedrovelasco
 *
 */

public class Main extends Application {
	
	private Stage primaryStage;
	private AnchorPane rootLayout;
	private AnchorPane formularioLayout;
	private RootLayoutController rootController;
	private formularioLayoutController formularioController;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		primaryStage.setTitle("My GitHub");
		
		
		initScene();
				
	}
	
	/**
	 * Inicia la escena y crea el stage con el rootLayout cargado
	 * @see RootLayoutController
	 */
	public void initScene(){
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/rootLayout.fxml"));
        loader.setController(rootController);
        try {
			rootLayout = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
       
        Scene scene = new Scene(rootLayout);
     
        
        primaryStage.setScene(scene);
        rootController = loader.getController();
        
        //pasar metodos de controler de esta clase
        rootController.setMain(this);

        primaryStage.show();
		
		
	}
	
	/**
	 * Cambiar el stage por el de el formulario
	 * @see formularioLayoutController
	 */
	public void cambiar(){
    	
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/formularioLayout.fxml"));
        if(loader.getController() != null){
        loader.setController(formularioController);}
        try {
			formularioLayout = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
       
        Scene scene = new Scene(formularioLayout);
     
        
        primaryStage.setScene(scene);
        formularioController = loader.getController();
        
        
        formularioController.setMain(this);
        primaryStage.show();
		
   
}
	/**
	 * Vuelve a cambiar el stage por el de el root
	 * @see RootLayoutController
	 */
	public void cambiarP(){
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/rootLayout.fxml"));
        
        try {
			rootLayout = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
       
        Scene scene = new Scene(rootLayout);
     
        
        primaryStage.setScene(scene);
        rootController = loader.getController();
        
        //pasar metodos de controler de esta clase
        rootController.setMain(this);

        primaryStage.show();
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
