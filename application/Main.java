package application;
	

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label greetingLabel = new Label("CS400 MyFirstJavaFX");
			BorderPane root = new BorderPane();
			greetingLabel.setFont(new Font("Cambria",30));
			
			ComboBox combo = new ComboBox();
			combo.getItems().addAll("Option 1" , "Option 2" , "Option 3");
			
			Image image = new Image("cringe.PNG");
			ImageView imageView = new ImageView(image);
			
			
			Button button = new Button("DONE");
			
			TextField text = new TextField();
			text.setPrefColumnCount(5);
			
			root.setTop(greetingLabel);
			root.setAlignment(greetingLabel,Pos.CENTER);
			BorderPane.setMargin(greetingLabel, new Insets(10));
			root.setLeft(combo);
			BorderPane.setMargin(combo, new Insets(10));
			root.setCenter(imageView);
			BorderPane.setMargin(imageView, new Insets(0,75,0,0));
			root.setBottom(button);
			root.setAlignment(button,Pos.CENTER);
			root.setRight(text);
			BorderPane.setMargin(text, new Insets(10));
	
			Scene scene = new Scene(root,500,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Sahil's First JavaFX program");
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println(javafx.scene.text.Font.getFamilies());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
