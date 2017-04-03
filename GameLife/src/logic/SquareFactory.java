package logic;

import java.io.Serializable;
import controllers.MainController;

public class SquareFactory implements Serializable{
	
	private SquareType green;
	private SquareType blue;
	private SquareType orange;
	private SquareType red;
	private MainController mainView;
	
   public Square createSquare(int index){	
      if(  index == 1 
    	|| index == 4  
    	|| index == 12 
    	|| index == 21 
    	|| index == 26 
    	|| index == 32 
    	|| index == 42 
    	|| index == 48 
    	|| index == 53
    	|| index == 61
    	|| index == 68
    	|| index == 74
    	|| index == 82
    	|| index == 89
    	|| index == 95){
    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#90ee90");
         return green.create(index);
         
      } else if(index==20 
    		  || index==41 
    		  || index==55 
    		  || index == 64 
    		  || index == 80 ){
    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#1e90ff");
         return blue.create(index);
         
      } else if(index == 1 
     		 || index == 10
     		 || index == 15) {
     	  return red.create(index);
       }
       
      
      else{
    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#ffa500");
          return orange.create(index);
      }
      
   }
}
