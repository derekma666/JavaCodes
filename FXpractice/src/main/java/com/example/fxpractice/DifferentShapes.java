package com.example.fxpractice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class DifferentShapes extends Application
{
    @Override
    public void start(Stage stage)
    {
        // Rectangle
        Rectangle rectangle = new Rectangle(50,50,100,50);
        rectangle.setFill(Color.BROWN);
        rectangle.setStroke(Color.BLACK);

        // Circle
        Circle circle = new Circle(20,80,10);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLUE);

        // Ellipse
        Arc arc_1 = new Arc(40,30,20,10,0,360);
        arc_1.setFill(Color.WHITE);
        arc_1.setStroke(Color.BLACK);

        //Line
        Line line = new Line(40,10,80,8);
        line.setStroke(Color.GREEN);

        //text
        Text message = new Text();
        message.setText("This is different shapes.");


         //create a group
         Group group = new Group(circle,rectangle,arc_1,line,message);

         //create and configure a new scene
         Scene scene = new Scene(group,250, 275, Color.WHITE);

         stage.setScene(scene);
         stage.setTitle("Different Geometry Visualisation");

         stage.show();
}
    public static void main(String[] args)
    {
        launch(args);
}

}
