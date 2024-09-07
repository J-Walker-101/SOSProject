import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class javaFX1 extends Application {

    public void start(Stage stage) {
        // Creating text (Label)
        Label label = new Label("This is a sample GUI for the SOS Project");

        // Creating a line
        Line line = new Line(10, 50, 200, 50);  // Start and end points (x1, y1, x2, y2)

        // Creating a checkbox
        CheckBox checkBox = new CheckBox("Enable Option");

        // Creating radio buttons
        RadioButton radioButton1 = new RadioButton("Option 1");
        RadioButton radioButton2 = new RadioButton("Option 2");

        // Grouping the radio buttons to allow only one selection at a time
        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);

        // Creating a layout to hold the GUI elements
        VBox layout = new VBox(10);  // Vertical layout with 10px spacing
        layout.getChildren().addAll(label, line, checkBox, radioButton1, radioButton2);

        // Creating the scene and adding the layout
        Scene scene = new Scene(layout, 300, 200);

        // Setting the stage
        stage.setScene(scene);
        stage.setTitle("SOS GUI Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}
