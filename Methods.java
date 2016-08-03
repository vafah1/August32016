package com.daythree;

public class Methods {

	public static void main(String[] args) {
		boolean doWeHaveAllTheNotebooks = true;
		
		//Went to count the books and found one was lost, thus boolean was changed to false, shown below
		doWeHaveAllTheNotebooks = false;
		
		String whatHappened = notebook(doWeHaveAllTheNotebooks);
//		System.out.println(whatHappened);
		
		String doThisNext = whatHappened + "\nDo you know where the book is?";
				System.out.println(doThisNext);
	}
	public static String notebook(boolean isLost){
		
		String whatToDoNow = null;
		
		if (isLost){
			whatToDoNow = "Good, we have all the books.";
		}else{
		whatToDoNow = "Ask the students";	
		}
		return whatToDoNow;
		
	}
}

