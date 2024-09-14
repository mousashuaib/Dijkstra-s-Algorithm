package application;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class MapPathfinder extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {

		primaryStage.setTitle("World Map");
		MapController m = new MapController();
		BorderPane root = m.createUI();
		Scene scene = new Scene(root, 800, 600);
		root.prefWidthProperty().bind(scene.widthProperty());
		root.prefHeightProperty().bind(scene.heightProperty());
		primaryStage.setScene(scene);
		primaryStage.show();
	};

	public static void main(String[] args) {
		launch(args);
	}
}
