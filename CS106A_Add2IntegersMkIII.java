/***
 * File: CS106A_Add2IntegersMkIII
 * -------------------------------------
 * The CS106A_Add2IntegersMkIII class mimics
 * the readInt method via the readLine method.
 * It is simplified from the incomplete MkII
 * by way of not depending on a separate 
 * package. The method now lies in the same 
 * file as its implementor to more easily 
 * access the acm.util via a ConsoleProgram
 * extension.
 * 
 * Attriubtions:
 * This solution is based on SergiuPlesco's 
 * posted in github at the below url:
 * 
 * https://github.com/SergiuPlesco/The-Art-and-Science-of-Java/blob/master/Chapter-8/Add2Integers.java
 */

import acm.program.*; 
//this is a subclass of java.lang.Object
//it's why we have access to Java.Lang.Integer.parseInt(String str);
//consider the rest a 'black box'

public class CS106A_Add2IntegersMkIII extends ConsoleProgram
{
	/** named constants */
	private static final int SENTINEL = -1;
	
	public void run()
	{
		println("enter 2 integers to add. They may be negative. Enter '-1' to exit.");
		
		while(true){
			int n1 = myReadInt("Enter n1: ");
			if (n1 == SENTINEL){ println("goodbye"); return; }
			
			int n2 = myReadInt("Enter n2: ");
			if (n2 == SENTINEL){ println("goodbye"); return; }
			
			int sum = n1 + n2;
			
			println(n1 + " + " + n2 + " = " + sum);
		}
	}
	
	
	/**
	 * @param prompt The prompt displayed to the user
	 * @return String returned in integer format for sum
	 * */
	private int myReadInt(String prompt)
	{
		int numStrToInt;
	
		while(true){
			String checkedStr = "";
			String numStr = readLine(prompt);
			for (int i = 0; i < numStr.length(); i++){
				char c = numStr.charAt(i);
				
				if (i == 0 && c == '-'){
					//testing the absence of .equals() method for lack of existence
					//in chars
					println("negative detected");
					checkedStr += c;
				} else if (Character.isDigit(c)){
					checkedStr += c;
				} 	
			}
			
			if (numStr.equals(checkedStr)){
				numStrToInt = Integer.parseInt(checkedStr);
				break;
			} else { 
				println("Error: Invalid format. Please try again.");
			}
		}
		
		return numStrToInt;
	}
}