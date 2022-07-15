package com.example.fxpractice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Shapes extends Application
{
    @Override
    public void start(Stage stage)
    {
        // text box
       TextField text_1 = new TextField();
       text_1.setMaxWidth(50);

       TextField text_2 = new TextField();
       text_2.setMaxWidth(50);

        // text on the tab
        Label step_1 = new Label("Step 1: Please type your sides.");
        step_1.setTextFill(Color.BLUE);
        step_1.setFont(Font.font("Arial", 20));

        Label step_2 = new Label("Step 2: Please type your color.");
        step_2.setTextFill(Color.BLUE);
        step_2.setFont(Font.font("Arial", 20));

        //Build Hbox 1
        HBox hbox_1 = new HBox(10);
        hbox_1.setAlignment(Pos.CENTER);
        hbox_1.getChildren().addAll(step_1,text_1);

        //Build Hbox 2
        HBox hbox_2 = new HBox(10);
        hbox_2.setAlignment(Pos.CENTER);
        hbox_2.getChildren().addAll(step_2,text_2);

        //Build new
        Polygon hexagon = new Polygon();
        Text message = new Text();
        Text message_2 = new Text();

        //Create buttons
        Button sidesButton = new Button();
        sidesButton.setText("Compute");
        sidesButton.setOnAction(
                e ->
                {
                    //1. Initialisation (clear the shapes and messages)
                    hexagon.getPoints().clear();
                    message.setText("");

                    // 2. Inputs
                    if (text_1.getText().isEmpty() == false){
                        switch (text_1.getText()){
                            case "4":
                                //Adding coordinates to the hexagon
                                hexagon.getPoints().addAll(new Double[]{
                                        200.0, 200.0,
                                        200.0, 400.0,
                                        400.0, 400.0,
                                        400.0, 200.0});
                                break;
                            case "5":
                                //Adding coordinates to the hexagon
                                hexagon.getPoints().addAll(new Double[]{
                                        300.0, 200.0,
                                        200.0, 300.0,
                                        250.0, 400.0,
                                        350.0, 400.0,
                                        400.0, 300.0
                                        });
                                break;
                            case "6":
                                //Adding coordinates to the hexagon
                                hexagon.getPoints().addAll(new Double[]{
                                        200.0, 200.0,
                                        100.0, 300.0,
                                        200.0, 400.0,
                                        300.0, 400.0,
                                        400.0, 300.0,
                                        300.0, 200.0, });
                                break;
                            default:
                                message.setText("Wrong");
                        }
                    }
                    else {
                        message.setText("Please input the side number.");
                    }
                }
        );

        Button colorButton = new Button();
        colorButton.setText("Make it colorful");
        colorButton.setOnAction(
                e ->
                {
                    message_2.setText("");
                    if(text_2.getText().isEmpty() == false){
                        switch (text_2.getText().toLowerCase()){
                            case "blue":
                                hexagon.setFill(Color.BLUE);
                                break;
                            case "yellow":
                                hexagon.setFill(Color.YELLOW);
                                break;
                            case "green":
                                hexagon.setFill(Color.GREEN);
                                break;
                            default:
                                message_2.setText("Wrong color. please enter blue, yellow or green.");
                        }
                    }
                    else {
                        message_2.setText("Please enter your color.");
                    }
                }
        );

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(hbox_1,sidesButton,hbox_2,colorButton,message_2,message,hexagon);
        //create and configure a new scene
        Scene scene = new Scene(root,500, 600);

        stage.setScene(scene);
        stage.setTitle("Shapes");

        stage.show();
}
    public static void main(String[] args)
    {
    launch(args);
}

}
