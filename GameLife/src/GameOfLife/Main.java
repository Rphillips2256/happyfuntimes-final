package GameOfLife;

import java.io.*;

import controllers.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
import logic.*;
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
		showStart();
		//showMainView();
		
	}
	
	private void showMenu(){
		
		GridPane menu = new GridPane();
		
		Button add = new Button("Add Player");
		Button begin = new Button("Begin");
		
		add.setPrefSize(100, 20);
		begin.setPrefSize(75, 20);
		
		Label name = new Label("Player Name:");
		name.setPadding(new Insets(5,5,5,5));
		name.setFont(Font.font("Tahoma"));
		
		Text title = new Text("Add a Player");
		title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		title.setTextAlignment(TextAlignment.CENTER);
		
		menu.add(title, 0, 0, 2, 1);
		
		Label color = new Label("Pick Color");
		
		menu.add(name, 0, 1);
		menu.add(color, 0, 2);
		
		menu.add(add, 0, 4);
		menu.add(begin, 1, 4);
		
		TextField pName = new TextField();
		menu.add(pName, 1, 1);
		
		ColorPicker pick = new ColorPicker();
		menu.add(pick, 1, 2);
		
		Scene menuScene = new Scene(menu);
		primaryStage.setScene(menuScene);
		primaryStage.setTitle("Life");
		primaryStage.show();
		
		add.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent event) {
				
				String name = pName.getAccessibleText();
				
				
				Player curr = new Player(name);
				
			}
		});
	}
	
	private void showStart(){
		Pane startPane = new Pane();
		
		Button start = new Button("Start Game");
		start.setPrefSize(100, 20);
		ImageView image = new ImageView(
				new Image("file:///Users/rs5634nr/git/happyfuntimes-final/GameLife/res/logo.jpeg"));
		
		image.relocate(10, 10);
		start.relocate(165, 175);
		
		startPane.getChildren().addAll(image, start);
		
		startPane.setPrefSize(425, 300);
		
		Scene startScene = new Scene(startPane);
		primaryStage.setScene(startScene);
		primaryStage.setTitle("Life");
		primaryStage.show();
		
		start.setOnAction(new EventHandler<ActionEvent>(){
			@Override public void handle(ActionEvent e){
				showMenu();
			}
		});
		
		
	}
	
	private void showMainView() throws IOException{

		GridPane pane = new GridPane();
		
		GridControl board = new GridControl();
		
		Button spin = new Button("spin");
		
		Label spinLabel = new Label();
		
		Label player1 = new Label();
		Label player2 = new Label();
		//Label player3 = new Label();
		//Label player4 = new Label();
		
		spinLabel.setPrefSize(75, 75);
		spinLabel.setStyle("-fx-background-color: darkgrey");
		
		player1.setPrefSize(75, 75);
		player1.setStyle("-fx-background-color: red");
		
		player2.setPrefSize(75, 75);
		player2.setStyle("-fx-background-color: blue");
		
		//player3.setPrefSize(75, 75);
		//player3.setStyle("-fx-background-color: yellow");
		
		//player4.setPrefSize(75, 75);
		//player4.setStyle("-fx-background-color: purple");
		
		pane.setPrefSize(800, 760);
		
		
		pane.add(board.makeBoard(), 1, 1, 3, 3 );
		pane.add(spin, 0, 0);
		pane.add(spinLabel, 1, 0);
		pane.add(player1, 0, 1);
		//pane.add(player3, 0, 2);
		pane.add(player2, 4, 1);
		//pane.add(player4, 4, 2);
		
		pane.setGridLinesVisible(true);
		
		
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.show();
		
		spin.setOnAction(new EventHandler<ActionEvent>(){
			public void handle1(ActionEvent e){
				Spin spin = new Spin();
				int getSpin = spin.spinner();
				spinLabel.setText("Spin: " + getSpin); 
			}

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
