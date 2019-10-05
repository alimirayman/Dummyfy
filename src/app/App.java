package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.StackPane;
// import javafx.scene.layout.VBox;
import javafx.stage.Stage;
// import DymmyModal;

/**
 * @author      Mir Ayman Ali   <alimirayman@outlook.com>
 * @version     1.0             (current version number of program)
 */

public class App extends Application {

  Stage window;
  Scene scene1, scene2;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;

    
    // Grid Plane
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setPadding(new Insets(8, 8, 8, 8));
    grid.setHgap(16);
    grid.setVgap(12);
    grid.setId("pane");

    // Label for asking the Question
    Label question = new Label("What's your name?");
    question.prefWidth(50);
    question.setAlignment(Pos.CENTER);

    // Textfield for geting user name
    TextField username = new TextField();
    username.setPromptText("Ayman");
    username.maxWidth(20);
    username.setAlignment(Pos.CENTER);

    // Button to goto next page
    Button button = btn("Next");
    button.setAlignment(Pos.CENTER);
    button.setOnAction(e -> DummyModal.show("Daa!!!", username.getText()));

    // add Nodes to grid
    grid.add(question, 0, 0);
    grid.add(username, 0, 1);
    grid.add(button, 0, 2);
    
    
    // scene 1
    scene1 = new Scene(grid, 800, 480);
    scene1.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
    window.setScene(scene1);
    window.setTitle("Dummyfy");
    window.show();
  }


  /**
  * Creates a button with style
  * @param  text    text inside the button
  * @return         a button with style and text
  */
  public Button btn(String text) {
    Button button = new Button(text);
    button.getStyleClass().add("btn");
    return button;
  }

  public static void main(String[] args) {
    launch(args);
  }
}
