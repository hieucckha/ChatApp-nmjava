package com.nmjava.chatapp.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class TestController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e){
        System.out.println("up");
        myCircle.setCenterY(y-=1);
    }
    public void down(ActionEvent e){
        System.out.println("down");
        myCircle.setCenterY(y+=1);
    }
    public void left(ActionEvent e){
        myCircle.setCenterX(x-=1);
        System.out.println("left");
    }
    public void right(ActionEvent e){
        myCircle.setCenterX(x+=1);
        System.out.println("right");
    }


}
