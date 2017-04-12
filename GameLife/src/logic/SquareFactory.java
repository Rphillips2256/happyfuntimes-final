package logic;

import java.io.Serializable;
public class SquareFactory implements Serializable{
//	
	//
	//
	private SquareType green;
	private SquareType orange;
	private SquareType red;
<<<<<<< HEAD
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
=======
	
   public Square createSquare(int index){	
      if(  index == 4  
>>>>>>> refs/remotes/origin/master
    	|| index == 12 
    	|| index == 17
    	|| index == 21 
    	|| index == 26 
    	|| index == 32
    	|| index == 35
    	|| index == 39
    	|| index == 42 
<<<<<<< HEAD
    	|| index == 46
    	){
    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#90ee90");
         return green.event(index,player);
=======
    	|| index == 48 
    	|| index == 53
    	|| index == 61
    	|| index == 68
    	|| index == 74
    	|| index == 82
    	|| index == 89
    	|| index == 95){
         return green.create(index);
>>>>>>> refs/remotes/origin/master
         
<<<<<<< HEAD
=======
      } else if(index==20 
    		  || index==41 
    		  || index==55 
    		  || index == 64 
    		  || index == 80 ){
         return blue.create(index);
>>>>>>> refs/remotes/origin/master
         
<<<<<<< HEAD
      }
=======
      } else if(index == 1 
    		 || index == 10
    		 || index == 15) {
    	  return red.create(index);
      }
      
>>>>>>> refs/remotes/origin/master
      
      else{
<<<<<<< HEAD
    	  mainView.getGrid().getChildren().get(index).setStyle("-fx-background-color:#ffa500");
          return orange.event(index,player);
=======
          return orange.create(index);
>>>>>>> refs/remotes/origin/master
      }
      
   }
}
