package controllers;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;

public class GridControl {
	
	public GridControl(){
		
	}
	
	public GridPane makeBoard(){
		GridPane board = new GridPane();
		Map map = new Map();
        for(int col = 0; col < map.mapGrid().length; col++){
            for(int row = 0; row < map.mapGrid()[col].length; row++){
             
            	if(map.mapGrid()[col][row] == 1){
            		MakeBoardSquare orange = new MakeBoardSquare(1);
            		board.add(orange, col, row);
            	} else if(map.mapGrid()[col][row] == 2){
            		MakeBoardSquare blue = new MakeBoardSquare(2);
            		board.add(blue, col, row);
            	} else if(map.mapGrid()[col][row] == 3){
            		MakeBoardSquare green = new MakeBoardSquare(3);
            		board.add(green, col, row);
            	}else if(map.mapGrid()[col][row] == 4){
            		MakeBoardSquare red = new MakeBoardSquare(4);
            		board.add(red, col, row);
            	}else{
            		MakeBoardSquare grey = new MakeBoardSquare(0);
            		board.add(grey, col, row);
            	}
            	
            }
                
        }
        //Image image = new Image("/Users/rs5634nr/git/happyfuntime-cs410-winona/GameLife/res/GameOfLife.jpeg");
       // board.setBackground(new Background(new BackgroundImage(image, 
        //		BackgroundRepeat.REPEAT, 
        //		BackgroundRepeat.REPEAT, 
        //		BackgroundPosition.DEFAULT, 
        //		BackgroundSize.DEFAULT)));
        
        board.setPrefHeight(500);
        board.setPrefWidth(500);
        board.setGridLinesVisible(true);
        return board;
	}

}
