package logic;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fy5464yl
 */
public class Career {

  static Spin spinner = new Spin();
  static int answer = spinner.spinner();
      
  /* if the opponent owns the matching career card pay the opponent the amount on
    the space.
    if you own the matching career card pay nothing
    if no player owns this card pay the bank
    for example if you land on the ski accident space you have to pay the doctor 
    the amount on the card*/
    
    public static void Spin(Player input){
        
        /*pass the player object so you can set what career*/
           
       

          
          System.out.print("You rolled:\t["+answer+"]");
          
          
          if ( answer ==1){
              input.setCareer("Sales Person");
              System.out.println("Your new Career is:"+"Sales Person");
              System.out.println(input.toString());   
          }
          else if( answer ==2){
               input.setCareer("Police Officer");
                System.out.println("Your new Career is:"+"Police Officer");
                 System.out.println(input.toString());
          }
          
          else if ( answer ==3){
               input.setCareer("Travel Agent");
                System.out.println("Your new Career is:"+"Travel Agent");
                 System.out.println(input.toString());
          }
          
         else if ( answer ==4){
               input.setCareer("Artist");
                System.out.println("Your new Career is:"+"Artist");
                 System.out.println(input.toString());
          }
          else if ( answer ==5){
               input.setCareer("Accountant");
                System.out.println("Your new Career is:"+"Accountant");
                 System.out.println(input.toString());
          }
          else if ( answer ==6){
               input.setCareer("Super Star");
                System.out.println("Your new Career is:"+"Super Star");
                 System.out.println(input.toString());
          }
          else if ( answer ==7){
               input.setCareer("Teacher");
                System.out.println("Your new Career is:"+"Teacher");
                 System.out.println(input.toString());
          }
          else if ( answer ==8){
               input.setCareer("Doctor");
                System.out.println("Your new Career is:"+"Doctor");
                 System.out.println(input.toString());
          }
          else if ( answer ==9){
               input.setCareer("Athlete");
                System.out.println("Your new Career is:"+"Athlete");
                 System.out.println(input.toString());
          }
          else if (answer == 10){
        	  input.setCareer("Programmer");
              System.out.println("Your new Career is:"+"Programmer");
               System.out.println(input.toString());
          }
   }
    
    
    
}
