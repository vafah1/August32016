
package com.daythree;

public class SampleBowlingGame {


	public static void main(String[] args) {

		int frames = 10;
		int numOfPins = 11;
		int numOfRolls = 2;
		boolean startRolling = false;
		
		
		for (int i = 0; i <= frames; i++) {
			int roll1 = (int) (Math.random() * numOfPins);
			int roll2 = (int) (Math.random() * (numOfPins - roll1));
			if (numOfPins - roll1 == 0) {
				System.out.println("First roll " + roll1);
				System.out.println("STRIKE!");
			}
			else{
				        if (roll1 + roll2 == 10) {
					            System.out.println("You rolled a SPARE");
				               }else{
				            	   System.out.println("You Rolled");
				            	   System.out.println(roll1);
				            	   System.out.println(roll2);
				            	   
				            	   
				                     }
		     }

//		for (int i = 0; i < 10; i++) {
//			System.out.println("Frame " + (i + 1));
//			for (int j = 0; j < 2; j++) {
//				System.out.println("Roll " + (j + 1) + "\n");
//			}
			//			for (int i = 0; i < numOfPins; i++) {

		}
	}
}










// System.out.println("Hello, Welcome to my Bowling Game!");
// // rollBall(4);
// System.out.println("You have " + numOfRolls + " rolls");
//
// String startRolling = roll.nextLine();
//	}
//
//	public static void letsStart(boolean startRolling) {
//		switch (startRolling.toLowerCase) {
//		case "Y":
//
//			break;
//
//		default:
//			break;
//		}
//
//	}


