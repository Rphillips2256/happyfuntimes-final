package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class MainController {
	
	@FXML 
	private GridPane grid;
	@FXML
	private Label redArea;
	private Label yellowArea;
	private Label greenArea;
	private Label whiteArea;
	private Label orangeArea;
	private Label blueArea;
	@FXML
	private Pane pane;
	
	
	public MainController(){
		generateGridArea();
	}
	
	public GridPane getGrid() {
		return grid;
	}



	public void setGrid(GridPane grid) {
		this.grid = grid;
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



	public Pane getPane() {
		return pane;
	}	
	
	protected void generateGridArea(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				grid.add(pane, i, j);
			}
			
			grid.getChildren().get(0).setStyle("-fx-background-color:green");
		}
	}
	
}
