package app;

import java.io.File;
import java.io.FileInputStream;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
// import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * DummyModal
 */
public class DummyModal {

  
  public static void show(String windowTitle, String name) {
    Stage modal = new Stage();

    modal.initModality(Modality.APPLICATION_MODAL);
    modal.setTitle(windowTitle);

    GridPane grid = new GridPane();
    grid.setId("pane");
    grid.setHgap(16);
    grid.setVgap(12);
    grid.setAlignment(Pos.CENTER);

    try{
      FileInputStream input = new FileInputStream(new File("../resources/Monkey.png"));
      Image image = new Image(input);
      ImageView imageView = new ImageView(image);
      grid.add(imageView, 0, 2);
    } catch (Exception e) {
      System.out.println(e);
    }
    
    Label nameLabel = new Label("My name is " + name);
    nameLabel.setStyle("-fx-text-fill: #d32f2f");

    Label dummyLabel = new Label("I was a dummy!!!");
    
    Button backButton = new Button("Back");
    backButton.setOnAction(e -> modal.close());

    grid.add(nameLabel, 0, 0);
    grid.add(dummyLabel, 0, 1);
    grid.add(backButton, 0, 3);

    // scene 1
    Scene scene = new Scene(grid, 400, 240);
    modal.setScene(scene);
    modal.showAndWait();
  }
}