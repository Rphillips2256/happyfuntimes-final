package logic;

import java.io.Serializable;
public class SquareFactory implements Serializable{
//	
	//
	//
	private SquareType green;
	private SquareType blue;
	private SquareType orange;
	private SquareType red;
	
   public Square createSquare(int index){	
      if(  index == 4  
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
         return green.create(index);
         
      } else if(index==20 
    		  || index==41 
    		  || index==55 
    		  || index == 64 
    		  || index == 80 ){
         return blue.create(index);
         
      } else if(index == 1 
    		 || index == 10
    		 || index == 15) {
    	  return red.create(index);
      }
      
      
      else{
          return orange.create(index);
      }
      
   }
}
