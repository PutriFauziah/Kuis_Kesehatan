/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Putri Usriyatul
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton Laki;
    @FXML
    private ToggleGroup Pilihan;
    @FXML
    private RadioButton Perempuan;
    @FXML
    private JFXTextField Nama;
    @FXML
    private JFXTextField Berat;
    @FXML
    private JFXTextField Tinggi;
    @FXML
    private TextArea Hasil;
    @FXML
    private TextArea Saran;
    @FXML
    private JFXButton Proses;
    @FXML
    private JFXButton Reset;
    @FXML
    private JFXTextField Ideal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
  
        int ideal = 0;
        String nama = Nama.getText();
        int tinggi = Integer.parseInt(Tinggi.getText());
        int berat = Integer.parseInt(Berat.getText());
     
    if(Laki.isSelected()) {
        ideal = tinggi-100;
        Ideal.setText(""+ideal);
        
    if (ideal== berat){
            Hasil.setText("Nama:  "+nama+"\n"+ "Tinggi:  "+tinggi+"\n"+"\n"+" Ideal ");
            Saran.setText("Pertahankan");
        }
        else if(ideal > berat){
            Hasil.setText("Nama:  "+nama+"\n"+ "Tinggi:  "+tinggi+"\n"+"Underweight ");
            Saran.setText("Sering-sering makan dengan pola yang teratur");
        }
        else if(ideal < berat){
            Hasil.setText("Nama: "+nama+"\n"+ "Tinggi: "+tinggi+"\n"+"Overweight ");
            Saran.setText ("Kurangi makan malam");
        }
    }
    
    
    if(Perempuan.isSelected()) {
        ideal = tinggi-110;
        Ideal.setText(""+ideal);
        
    if (ideal == berat){
            Hasil.setText("Nama:  "+nama+"\n"+ "Tinggi:  "+tinggi+"\n"+ "Ideal ");
            Saran.setText("Pertahankan dan Atur pola makan dengan baik");
        }
        else if(ideal > berat){
            Hasil.setText("Nama:  "+nama+"\n"+ "Tinggi:  "+tinggi+"\n"+"Underweight ");
            Saran.setText("Sering-sering makan dengan cara yang baik dan benar");
        }
        else if(ideal < berat){
            Hasil.setText("Nama: "+nama+"\n"+ "Tinggi: "+tinggi+"\n"+"Overweight ");
            Saran.setText ("1. Kurangi makan malam \n2. Diet dengan diet yang dianjurkan.\n3. Selain itu, kurangi makan junkfood");
        }
    }
    
    }

    @FXML
    private void Hapus(ActionEvent event) {
           Nama.setText("");
           Tinggi.setText("");
           Berat.setText("");
           Laki.setSelected(false);
           Perempuan.setSelected(false);
           Hasil.setText("");
           Ideal.setText("");
           Saran.setText("");
    }
    
}
