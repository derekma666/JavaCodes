package com.example.fxpractice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OblongGUI extends Application
{
    // create an object of the Oblong class as an attribute
    private Oblong testOblong = new Oblong(0, 0);

        @Override
        public void start(Stage stage)
        {
            // TextField create and configure text fields for input
            TextField lengthField = new TextField();
            lengthField.setMaxWidth(50);

            TextField heightField = new TextField();
            heightField.setMaxWidth(50);

            // TextArea non-editable text area to display the results
            TextArea display = new TextArea();
            display.setEditable(false);
            display.setMinSize(210, 50);
            display.setMaxSize(210, 50);

            // Label create and configure Labels for the text fields
            Label lengthLabel = new Label("Length");
            lengthLabel.setTextFill(Color.BLACK);
            lengthLabel.setFont(Font.font("Arial", 20));

            Label heightLabel = new Label("Height");
            heightLabel.setTextFill(Color.BLACK);
            heightLabel.setFont(Font.font("Arial", 20));

            // create and configure a button to perform the calculations
            Button calculateButton = new Button();
            calculateButton.setText("Calculate");
            calculateButton.setOnAction(e ->
                    {
                        if (lengthField.getText().isEmpty() || heightField.getText().isEmpty()) {
                            display.setText("Length and height must be entered");
                        }
                        else
                        {
                            testOblong.setLength(Double.parseDouble(lengthField.getText()));
                            testOblong.setHeight(Double.parseDouble(heightField.getText()));

                            display.setText("The area is: " + testOblong.calculateArea()
                                    + "\n" + "The perimeter is: "
                                    + testOblong.calculatePerimeter());
                        }
                    }
            );

            HBox inputComponents = new HBox(10);
            inputComponents.setAlignment(Pos.CENTER);
            inputComponents.getChildren().addAll(lengthLabel, lengthField, heightLabel, heightField);

            VBox root = new VBox(25);
            root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(inputComponents, calculateButton, display);

            Scene scene = new Scene(root, 350, 250);
            stage.setScene(scene);
            stage.setTitle("Oblong GUI");
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }

    }