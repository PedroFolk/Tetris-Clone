package com.example;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
    Rectangle a; 
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    private String name;
    public int form = 1;
    
    public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
    


    switch (name) {
        case "j":
            color = Color.GREY;
            break;
        case "l":
            color = Color.GOLD;
            break;
        case "o":
            color = Color.web("#FF3213");
            break;
        case "s":
            color = Color.web("#72CB3B");
            break;
        case "t":
            color = Color.web("#0341AE");
            break;
        case "z":
            color = Color.PINK;
            break;
        case "i":
            color = Color.web("#FF971C");
            break;
    
        
    }
    this.a.setFill(color);
    this.b.setFill(color);
    this.c.setFill(color);
    this.d.setFill(color);
    }

    //Getter
    public String getName(){
        return name;
    }
    public void changeForm(){
        if(form !=4){
            form++;
        }else{
            form = 1;
        }
    }
}
