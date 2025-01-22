import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXFormExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the GridPane layout
        GridPane grid = new GridPane();
        grid.setVgap(10); // Vertical gap between elements
        grid.setHgap(10); // Horizontal gap between elements
        grid.setPadding(new Insets(20, 20, 20, 20)); // Padding around the grid

        // Create labels
        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
       

        // Create input fields
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");

        ComboBox<String> genderComboBox = new ComboBox<>();
        genderComboBox.getItems().addAll("Male", "Female", "Other");
        genderComboBox.setValue("Male");

        // Create a submit button
        Button submitButton = new Button("Submit");

        // Handle button click event
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
     

            // Display the entered data (could be stored or used further)
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        
        });

        // Add components to the grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(emailLabel, 0, 1);
        grid.add(emailField, 1, 1);
        grid.add(submitButton, 1, 4);

        // Create the Scene and set it on the Stage
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("JavaFX Form Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Start the JavaFX application
    }
}
