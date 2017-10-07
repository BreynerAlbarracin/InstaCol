package control;

import modelo.Usuario;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * 
 * @author Usaka Rokujou
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField nombreTex;
    @FXML
    private TextField apellidoTex;
    @FXML
    private TextField correoTex;
    @FXML
    private TextField claveTex;
    @FXML
    private TextField fechaTex;
    @FXML
    private TextField idTex;
    @FXML
    private ImageView imagenvista;

    String srcimg;

    @FXML
    private void enviarBD(ActionEvent event) throws ParseException {

    }

    @FXML
    private void traerBD(ActionEvent event) throws ParseException {

    }

    @FXML
    private void borrarId(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void BuscarImagen(ActionEvent event) throws MalformedURLException {

    }

}
