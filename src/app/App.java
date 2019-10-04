package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

  Stage window;
  Scene scene1, scene2;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;

    
    // Layout 1 -> children are load out in vertical column
    VBox layout1 = new VBox(20);
    layout1.setId("pane");
    // Basic Setup Scene
    Label label1 = new Label("Welcome to first scene");
    Button button1 = new Button("Click Me!!");
    button1.setOnAction(e -> {
        layout1.getChildren().add(new Label("Alohamora"));
    });
    button1.setStyle("-fx-background-color: #004ba0; -fx-text-fill: #fff");
    layout1.getChildren().addAll(label1, button1);
    scene1 = new Scene(layout1, 400, 240);
    scene1.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());

    // init
    window.setScene(scene1);
    window.setTitle("Dummy One");
    // window.setFullScreen(true);
    window.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
