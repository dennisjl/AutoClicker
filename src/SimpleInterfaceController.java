import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.awt.*;

public class SimpleInterfaceController extends Application{

    @FXML
    private TextField myClicks;

    @FXML
    private TextField myDelay;

    @FXML
    private Button myButton;

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(this.getClass().getResource("SimpleInterface.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //testmetode
    public void click(){
        System.out.println("woho");
    }



    public static void main(String[] args){
        launch(args);
    }
}
