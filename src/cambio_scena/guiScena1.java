/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio_scena;

import static cambio_scena.Cambio_scena.login;
import static cambio_scena.Cambio_scena.password;
import static cambio_scena.Cambio_scena.scena2;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author russo.salvatore
 */
public class guiScena1 {
    private Scanner sc=new Scanner(System.in);
    private Stage s;
    private Scene scena;
    private Scene scena_2;
    private HBox h;
    private  Label l;
    private Button btn;
    private  TextField lo;
    private  TextField pa;
    public guiScena1(Stage s){
     this.s=s;
     gui();
    }
    public void gui(){
         h=new HBox();
         l=new Label("scena 1");
         lo=new TextField();
         pa=new TextField();
        btn = new Button();
        btn.setText("va alla scena due");
        btn.setOnMouseClicked((value->{
            //imposto la nuova scena
         scena2.getLogin(lo.getText());
         scena2.getPassword(pa.getText());
           s.setScene(scena_2);
           //mostro la scena imposta
           s.show();
        }));
          h.getChildren().addAll(l,btn,lo,pa);
        scena =new Scene(h, 500, 200);  
    }
    public Scene getScena(){
        return scena;    
    }

    public String getLo() {
        return login;
    }

    public String getPa() {
        return password;
    }
    
    public void setScena2(Scene scena2){
        this.scena_2=scena2;
    }
}
