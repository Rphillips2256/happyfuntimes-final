package GameOfLife;

import java.io.IOException;

import controllers.GridControl;
import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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
		//Map map = new Map(); not used here
		GridPane pane = new GridPane();
		
		GridControl board = new GridControl();
		
		Button spin = new Button("spin");
		
		Label spinLabel = new Label();
		
		Label player1 = new Label();
		Label player2 = new Label();
		Label player3 = new Label();
		Label player4 = new Label();
		
		spinLabel.setPrefSize(100, 100);
		spinLabel.setStyle("-fx-background-color: darkgrey");
		
		player1.setPrefSize(75, 75);
		player1.setStyle("-fx-background-color: red");
		
		player2.setPrefSize(75, 75);
		player2.setStyle("-fx-background-color: blue");
		
		player3.setPrefSize(75, 75);
		player3.setStyle("-fx-background-color: yellow");
		
		player4.setPrefSize(75, 75);
		player4.setStyle("-fx-background-color: purple");
		
		pane.setPrefSize(800, 760);
		
		
		pane.add(board.makeBoard(), 1, 1, 3, 3 );
		pane.add(spin, 0, 0);
		pane.add(spinLabel, 1, 0);
		pane.add(player1, 0, 1);
		pane.add(player3, 0, 2);
		pane.add(player2, 4, 1);
		pane.add(player4, 4, 2);
		
		pane.setGridLinesVisible(true);
		
		
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.show();
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
