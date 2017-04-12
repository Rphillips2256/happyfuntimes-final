package logic;


import java.util.Random;

import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fy5464yl
 */
public class Green implements SquareType, Serializable {
	    @Override
		public Square create(int index){
			Square rtn = new Square("Green" + index, index-1);
	        return rtn;
		}
	  public Player event(int index, Player player){
		  player.setIncome(player.getIncome() + player.getSalary());
		  System.out.println("You got paid"+player.getSalary());
		  return player;
	  }
	}
   /**    
   public void PayDay(Player input){
           
       System.out.println("You got paid"+input.getSalary());
       //whenever you land on or pass this card you collect your salary
     
      
      double temp =input.getSalary();
      input.setIncome(temp + input.getIncome());
       System.out.println(input.toString());
    
    
}
}*/