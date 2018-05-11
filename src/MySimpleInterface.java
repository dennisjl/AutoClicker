import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class MySimpleInterface extends Application {

	@FXML
	public javafx.scene.control.Button myAmazingButton;

	@FXML
	private Text MyTextViews;

	@FXML
	private Button MyCoolButton;

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(this.getClass().getResource("MyInterface.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void test() {
		System.out.println(MyTextViews);
		MyTextViews.setText("OMG IT WORKS!");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
