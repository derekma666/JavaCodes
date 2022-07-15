package com.example.fxpractice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Group;


public class ChangingFace extends Application
{
    @Override
    public void start(Stage stage)
    {
    //create and configure the main circle for the face
    Circle face = new Circle(125, 125, 80);
    face.setFill(Color.YELLOW);
    face.setStroke(Color.RED);

    //RIGHT EYE
    Circle rightEye = new Circle(86, 100, 10);
    rightEye.setFill(Color.BLACK);
    rightEye.setStroke(Color.RED);

    //Left eye
    Circle leftEye = new Circle(162, 100, 10);
    leftEye.setFill(Color.BLACK);
    leftEye.setStroke(Color.RED);

    //smiling mouth
    Arc mouth = new Arc(125, 150, 45, 35, 0, -180);
    mouth.setFill(Color.GREEN);
    mouth.setStroke(Color.GREEN);
    mouth.setType(ArcType.OPEN);

    //text
    Text caption = new Text(68, 240, "Changing Face");
    caption.setFill(Color.BLACK);
    caption.setFont(Font.font("Verdana",15));

    //create a group
    Group group = new Group(face, rightEye, leftEye, mouth, caption);

    //create a button
    Button smilebutton = new Button("smile");
    Button frownbutton = new Button("frown");

    //horizontal container
    HBox buttonBox = new HBox(10);
    buttonBox.setAlignment(Pos.CENTER);

    //add buttons in the horizontal containers
    buttonBox.getChildren().addAll(smilebutton, frownbutton);

    //vertical contianer
    VBox root = new VBox(10);
    root.setBackground(Background.EMPTY);
    root.setAlignment(Pos.CENTER);

    //add the button box and the face group to the vertical container
    root.getChildren().addAll(buttonBox, group);

    //create and configure a new scene
    Scene scene = new Scene(root,250, 275, Color.YELLOW);

    smilebutton.setOnAction(e ->mouth.setLength(-180));
    frownbutton.setOnAction(e ->mouth.setLength(180));

    stage.setScene(scene);
    stage.setTitle("Changing Face");

    stage.show();
}
    public static void main(String[] args)
    {
    launch(args);
}

}
