package controllers;

import javafx.scene.layout.Region;

public class MakeBoardSquare extends Region {
	
	public MakeBoardSquare(int curr){
		
		if(curr == 1){
			setStyle("-fx-background-color: goldenrod");
			setOpacity(0.1);
		} else if(curr == 2){
			setStyle("-fx-background-color: cadetblue");
			setOpacity(0.1);
		}else if(curr == 3){
			setStyle("-fx-background-color: green");
			setOpacity(0.1);
		} else if(curr == 4){
			setStyle("-fx-background-color: red");
			setOpacity(0.1);
		} else {
			setStyle("-fx-background-color: grey");
			setOpacity(0.1);
		}
		
		setPrefHeight(45);
		setPrefWidth(45);
		
	}
}
