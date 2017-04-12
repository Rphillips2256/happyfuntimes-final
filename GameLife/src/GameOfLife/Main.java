package GameOfLife;

import java.io.IOException;

import controllers.GridControl;
import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Square;
//change to this line
//lets change this line

public class Main extends Application {
	
	private Stage primaryStage;
	private Pane mainLayout;
	private MainController mainView;
	private Square currentSquare;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Life");
		
		showMainView();
		
	}
	
	private void showMenu(){
		
	}
	
	private void showStart(){
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(sun.applet.Main.class.getResource("view/StartScreen.fxml"));
		try {
			mainLayout = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void showMainView() throws IOException{
		BorderPane pane = new BorderPane();
		GridControl board = new GridControl();
		pane.setPrefHeight(900);
		pane.setPrefWidth(1200);
		pane.setCenter(board.makeBoard());
		
		
		
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.show();
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
