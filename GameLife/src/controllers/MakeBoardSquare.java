package controllers;

import javafx.scene.effect.Light;
import javafx.scene.layout.Region;

public class MakeBoardSquare extends Region {
	
	public MakeBoardSquare(int row){
		if(row==1||row==3||row==5){
			setStyle("-fx-background-color: orange");
		} else if(row==4||row ==6){
			setStyle("-fx-background-color: green");
		} else if(row == 7){
			setStyle("-fx-background-color: red");
		} else {
			setStyle("-fx-background-color: blue");
		}
		
		setPrefHeight(45);
		setPrefWidth(45);
		
	}
}
