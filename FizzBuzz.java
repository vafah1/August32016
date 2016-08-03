package com.daythree;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++){
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("FizzBuzzBang");
			}else if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.println("FizzBuzz");
			}else if (((i % 3) == 0) && ((i % 7) == 0)){
				System.out.println("FizzBang");
			}else if (((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("BuzzBang");
			}else if ((i % 3) == 0) {
				System.out.println("Fizz");
			}else if ((i % 5) == 0) {
				System.out.println("Buzz");
			}else if ((i % 7) == 0) {
				
			}else {
				System.out.println(i);
			}
		}























		//FizzBuzzBang
		//Test if 3 is cleanly divisible- Replace w/ Fizz
		//Test if 5 is cleanly divisible- Replace w/ Buzz
		//Test if 7 is cleanly divisible= replace w/ Bang

		////		int i = 0;
		////		if ((i % 3) == 0){
		////			
		////		}
		//				
		//	for (int i = 1; i <= 100; i++){
		//		if((i % 3) == 0){
		//			System.out.println("fizz");
		//		}else if (((i % 3) == 0) && ((i % 5) == 0)){
		//			System.out.println("FizzBuzz");
		//		}else {
		//			
		//		}
		//	}




	}

}
