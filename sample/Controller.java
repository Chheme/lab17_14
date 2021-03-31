package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
        @FXML
        TextField t1;

        @FXML
        TextField t2;

        @FXML
        TextField t3;

        @FXML
        public void cb1 (ActionEvent eventOne){
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        t3.setText(Double.toString(a+b));
    }

        @FXML
        public void cb2 (ActionEvent eventTwo){
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }



    }