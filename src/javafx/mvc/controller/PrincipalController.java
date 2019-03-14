
package javafx.mvc.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author drink
 */
public class PrincipalController implements Initializable {

    private Stage stagePrincipal;
    
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private MenuItem menuItemCadastroCliente;

    @FXML
    private MenuItem menuItemSistemaSair;
    
    @FXML
    public void menuItemSistemaSairClicked(){
        stagePrincipal.close();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public Stage getStagePrincipal() {
        return stagePrincipal;
    }

    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }
    
    
}
