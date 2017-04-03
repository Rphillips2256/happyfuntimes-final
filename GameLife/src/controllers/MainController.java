package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import logic.SquareFactory;

public class MainController {
	
	@FXML 
	private GridPane mainBoard;
	@FXML
	private Label redArea;
	private Label yellowArea;
	private Label greenArea;
	private Label whiteArea;
	private Label orangeArea;
	private Label blueArea;
	
	private SquareFactory factory;
	
	
	public MainController(){
		int counter = 0;
		while(counter < 100){
			factory.createSquare(counter);
			counter++;
			if(counter == 99){
				break;
			}
		}
	}
	
	public GridPane getGrid() {
		return mainBoard;
	}



	public void setGrid(GridPane grid) {
		this.mainBoard = grid;
	}



	public Label getRedArea() {
		return redArea;
	}



	public void setRedArea(Label redArea) {
		this.redArea = redArea;
	}



	public Label getYellowArea() {
		return yellowArea;
	}



	public void setYellowArea(Label yellowArea) {
		this.yellowArea = yellowArea;
	}



	public Label getGreenArea() {
		return greenArea;
	}



	public void setGreenArea(Label greenArea) {
		this.greenArea = greenArea;
	}



	public Label getWhiteArea() {
		return whiteArea;
	}



	public void setWhiteArea(Label whiteArea) {
		this.whiteArea = whiteArea;
	}



	public Label getOrangeArea() {
		return orangeArea;
	}



	public void setOrangeArea(Label orangeArea) {
		this.orangeArea = orangeArea;
	}



	public Label getBlueArea() {
		return blueArea;
	}



	public void setBlueArea(Label blueArea) {
		this.blueArea = blueArea;
	}
	
	
	
}
