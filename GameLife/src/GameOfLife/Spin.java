package GameOfLife;


import java.util.Random;
import java.util.Observable;
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
public class Spin extends Observable implements Serializable {
   
	public static final int MAX = 10;
	private int value;
	public Spin(){
		spinner();
	}
    
     public int spinner(){
       
    	value = (int) ((Math.random()*MAX)+1);
    
    	return value;
     }
    
}