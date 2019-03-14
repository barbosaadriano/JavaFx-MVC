
package javafx.mvc;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.mvc.controller.PrincipalController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author drink
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(PrincipalController.class.getResource(
                "/javafx/mvc/view/Principal.fxml"));
        Parent root = loader.load();        
        Scene scene = new Scene(root);
        
        PrincipalController c = loader.getController();
        c.setStagePrincipal(primaryStage);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sistema xyz");
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
