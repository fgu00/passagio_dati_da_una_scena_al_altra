/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio_scena;

import static cambio_scena.Cambio_scena.login;
import static cambio_scena.Cambio_scena.password;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author russo.salvatore
 */
public class guiScena2 {
  private Stage s;
  private Scene scena;
  private Scene scena2;
  private HBox h;
  private  Label l;
  private Button btn ;
  private Label pas;
  private Label lo;
  private Label nul;
  public guiScena2(Stage s){
     this.s=s;
     gui();
    }
    public void gui(){
         h=new HBox();
         l=new Label("scena 2");
         pas=new Label(password);
         lo=new Label(login);
         nul=new Label("        ");
           btn = new Button();
        btn.setText("va alla scena uno");
        btn.setOnMouseClicked((value->{
            //imposto la nuova scena
           s.setScene(scena2);
           //mostro la scena imposta
           s.show();
        }));
        h.getChildren().addAll(l,btn,lo,nul,pas);
        scena =new Scene(h, 500, 200);  
    }
    public Scene getScena(){
        return scena;    
    }
    public void setScena2(Scene scena2){
        this.scena2=scena2;
    }
    public void getLogin(String login){
      lo.setText(login);  
    }
    public void getPassword(String password){
        pas.setText(password); 
    }
}   

