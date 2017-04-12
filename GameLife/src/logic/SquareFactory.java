package logic;

import java.io.Serializable;
import controllers.MainController;

public class SquareFactory implements Serializable{
	
	private SquareType green;
	private SquareType orange;
	private SquareType red;
	private MainController mainView;
	public Square create(int index){
		if(  index == 1 
		    	|| index == 4  
		    	|| index == 12 
		    	|| index == 17
		    	|| index == 21 
		    	|| index == 26 
		    	|| index == 32
		    	|| index == 35
		    	|| index == 39
		    	|| index == 42 
		    	|| index == 46
		    	){
		    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#90ee90");
		         return green.create(index);
		         
		         
		      }
		      
		      else{
		    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#ffa500");
		          return orange.create(index);
		      }
	}
   public Player eventSquare(int index, Player player){	
      if(  index == 1 
    	|| index == 4  
    	|| index == 12 
    	|| index == 17
    	|| index == 21 
    	|| index == 26 
    	|| index == 32
    	|| index == 35
    	|| index == 39
    	|| index == 42 
    	|| index == 46
    	){
    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#90ee90");
         return green.event(index,player);
         
         
      }
      
      else{
    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#ffa500");
          return orange.event(index,player);
      }
      
   }
}
