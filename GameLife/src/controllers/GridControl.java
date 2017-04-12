package controllers;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;

public class GridControl extends Region {
	
	public GridControl(){
		
	}
	
	public GridPane makeBoard(){
		GridPane board = new GridPane();
		
        for(int col =0; col < 10; col++){
            for(int row=0;row<10; row++){
                
                if(row==1||row==3||row==5){
                 MakeBoardSquare square1 = new MakeBoardSquare(row);
                 board.add(square1, row, col);
                }
                else if(row==4||row ==6){
                	MakeBoardSquare square2 = new MakeBoardSquare(row);
                	board.add(square2, row, col);
                }
                else if(row ==7){
                	 MakeBoardSquare square3 = new MakeBoardSquare(row);
                	 board.add(square3, row, col);
                }
                else{
                	MakeBoardSquare square4 = new MakeBoardSquare(row);
                	board.add(square4, row, col);
                }
            }
                
        }
        
        board.setPrefHeight(500);
        board.setPrefWidth(500);
        board.setGridLinesVisible(true);
        return board;
	}

}
