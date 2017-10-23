/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author sheva
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField tinggi;
    @FXML
    private JFXTextField berat;
    @FXML
    private RadioButton rdlk;
    @FXML
    private RadioButton rdpr;
    @FXML
    private Button btnproses;
    @FXML
    private Button btnreset;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXTextArea beratideal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
    @FXML
    void proses(ActionEvent event) {
        int ideal = 0;
        String analis = null;
        String sarananalis = null;
            if (rdlk.isSelected()){
            ideal = Integer.parseInt(tinggi.getText().toString()) - 105;
            }
            if (rdpr.isSelected()){
            ideal = Integer.parseInt(tinggi.getText().toString()) - 110;
            }
        
            beratideal.setText(""+ideal);
        
            if(ideal == Integer.parseInt (tinggi.getText())){
            analis = "ideal";
            sarananalis = "Berat badan anda sudah ideal \nJagalah berat badan anda";
            }
            else if(ideal < Integer.parseInt (tinggi.getText())){
            analis = "Overweight";
            sarananalis = "Anda sedang mengalami overweight \nAtur pola makan anda hingga mencapai berat ideal";
            }
            else if(ideal > Integer.parseInt (tinggi.getText())){
            analis = "Underweight";
            sarananalis = "Anda sedang mengalami underweight \nAtur pola makan anda hingga mencapai berat ideal";
            }
            hasil.setText("Nama : "+nama.getText()+"\nAnda : "+analis);
            saran.setText(sarananalis);
        
    }

    @FXML
    void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        beratideal.setText("");
        hasil.setText("");
        saran.setText("");
        rdlk.setSelected(false);
        rdpr.setSelected(false);
    }
    
}
