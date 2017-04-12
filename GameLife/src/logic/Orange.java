package logic;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fy5464yl
 */
public class Orange implements SquareType, Serializable {
	public Square create(int index){
		Square rtn = new Square("Orange" + index, index-1);
        return rtn;
	}
	
	
	public Player event(int index, Player player){
		double temp;

		if ( index ==2){

			System.out.println("Tropical Vacation: pay 25,000");
			temp =player.getIncome();
			temp = temp - 25000;
			player.setIncome(temp);
		}


		else if( index ==3){

			System.out.println("Art Auction: Pay 20,000");

			temp =player.getIncome();
			temp = temp - 20000;
			player.setIncome(temp);

		}

		else if(index ==5){

			System.out.println("Buy big screen Tv: pay $5000");

			temp =player.getIncome();
			temp = temp - 5000;
			player.setIncome(temp);

		}

		else if(index==6){

			System.out.println("House Flooded!"
					+ "Pay $40,000");

			temp =player.getIncome();
			temp = temp - 40000;
			player.setIncome(temp);


		}

		else if(index ==7){

			System.out.println("Tv game show winner!"
					+ "Collect $95,000");

			double t = player.getIncome() + 95000;
			player.setIncome(t);

		}


		else if(index ==8){

			System.out.println("Learned CPR!"
					+ "Collect $5,000");
			double t = player.getIncome() + 95000;
			player.setIncome(t);
		}

		else if(index ==9){


			System.out.println("Burglar!"
					+ "Pay $50,000 if not insured");


			temp =player.getIncome();
			temp = temp - 50000;
			player.setIncome(temp);


		}
		else if(index==10){
			System.out.println("Help the illiterate");
		}

		else if(index ==11){
			System.out.println("Help the Homless");
			
		}
		else if(index ==13){

			System.out.println("You won the lottery"
					+ "You won $50,000");

			double t = player.getIncome() + 50000;
			player.setIncome(t);


		}
		else if(index ==14){

			System.out.println("Box seat at the World Series"
					+ "Pay 50,000");
				temp =player.getIncome();
			temp = temp - 50000;
			player.setIncome(temp);


		}
		else if(index == 15){
			System.out.println("You won the lottery"
					+ "You won $20,000");

			double t = player.getIncome() + 20000;
			player.setIncome(t);
		}
		else if(index ==16){

			System.out.println("Help out at the special olympics");


		}
		else if(index ==18){
			System.out.println("Family Portrait:"
					+ "Pay $35,000");
				temp =player.getIncome();
			temp = temp - 35000;
			player.setIncome(temp);

		}
		else if(index ==19){
			System.out.println("Tax refund: "
					+ "collect $75000");
			double t = player.getIncome() + 75000;
			player.setIncome(t);

		}
		else if(index ==20){
			System.out.println("You Donated $5,000 to feed the homeless! ");
			temp =player.getIncome();
			temp = temp - 5000;
			player.setIncome(temp);
		}
		else if(index ==22){
			System.out.println("Write best seller. Collect $80000");

			double t = player.getIncome() + 80000;
			player.setIncome(t);

		}
		else if(index ==23){
			System.out.println("Join the health Club.");
		}
	
		else if(index ==24){
			System.out.println("Find Burried Treasure. Collect $100,000");

			double t = player.getIncome() + 100000;
			player.setIncome(t);
		}
		
		else if(index ==25){
			System.out.println("TV game show winner. Collect $95000");
			double t = player.getIncome() + 95000;
			player.setIncome(t);
		}
		else if(index ==27){
			System.out.println("African Safari"
					+ "Pay $25,000");

				temp =player.getIncome();
			temp = temp - 25000;
			player.setIncome(temp);

		}
		else if(index ==28){
			System.out.println("Play a family game");
		}
		else if(index ==29){
			System.out.println("Sponsor a child");
		}
		else if(index ==30){
			System.out.println("Spring for Gym equipment"
					+ "Pay $30,000");
				temp =player.getIncome();
			temp = temp - 30000;
			player.setIncome(temp);
		}

		if ( index ==31){

			System.out.println("Tropical Vacation: pay 25,000");
			temp =player.getIncome();
			temp = temp - 25000;
			player.setIncome(temp);
		}


		else if( index ==33){

			System.out.println("Art Auction: Pay 20,000");

			temp =player.getIncome();
			temp = temp - 20000;
			player.setIncome(temp);

		}

		else if(index ==34){

			System.out.println("Buy big screen Tv: pay $5000");

			temp =player.getIncome();
			temp = temp - 5000;
			player.setIncome(temp);

		}

		else if(index==36){

			System.out.println("House Flooded!"
					+ "Pay $40,000");

			temp =player.getIncome();
			temp = temp - 40000;
			player.setIncome(temp);


		}

		else if(index ==37){

			System.out.println("Tv game show winner!"
					+ "Collect $95,000");

			double t = player.getIncome() + 95000;
			player.setIncome(t);

		}


		else if(index ==38){

			System.out.println("Learned CPR!"
					+ "Collect $5,000");
			double t = player.getIncome() + 95000;
			player.setIncome(t);
		}

		else if(index ==40){


			System.out.println("Burglar!"
					+ "Pay $50,000 if not insured");


			temp =player.getIncome();
			temp = temp - 50000;
			player.setIncome(temp);


		}

		else if(index ==41){
			System.out.println("Help the Homless");
			
		}
		else if(index ==43){

			System.out.println("You won the lottery"
					+ "You won $50,000");

			double t = player.getIncome() + 50000;
			player.setIncome(t);


		}
		else if(index ==44){

			System.out.println("Box seat at the World Series"
					+ "Pay 50,000");
				temp =player.getIncome();
			temp = temp - 50000;
			player.setIncome(temp);


		}
		else if(index ==45){

			System.out.println("Help out at the special olympics");


		}
		else if(index ==47){
			System.out.println("Family Portrait:"
					+ "Pay $35,000");
				temp =player.getIncome();
			temp = temp - 35000;
			player.setIncome(temp);

		}
		else if(index ==48){
			System.out.println("Tax refund: "
					+ "collect $75000");
			double t = player.getIncome() + 75000;
			player.setIncome(t);

		}
		else if(index ==49){
			System.out.println("You Donated $5,000 to feed the homeless! ");
			temp =player.getIncome();
			temp = temp - 5000;
			player.setIncome(temp);
		}
	
		else{//space 50
			System.out.println("Write best seller. Collect $80000");

			double t = player.getIncome() + 80000;
			player.setIncome(t);
		}

		return player;
	}
}









