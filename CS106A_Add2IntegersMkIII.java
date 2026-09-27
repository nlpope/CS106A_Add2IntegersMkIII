//CS106A_Add2IntegersMkIII
/***
 * The CS106A_Add2IntegersMkIII class mimics
 * the readInt method via the readLine method.
 * It is simplified from the incomplete MkII
 * by way of not depending on a separate 
 * package. The method now lies in the same 
 * file as its implementor to more easily 
 * access the acm.util via a ConsoleProgram
 * extension.
 */

import acm.program.*; 
//this is a subclass of java.lang.Object
//it's why we have access to Java.Lang.Integer.parseInt(String str);
//consider the rest a 'black box'

public class CS106A_Add2IntegersMkIII extends ConsoleProgram
{
	private static final int SENTINEL = -1;
	public void run()
	{
		println("applet running...");
		while(true){
			Integer n1 = myReadInt("Enter n1: ");
			if (n1 == null){}
			if (n1 == SENTINEL){ println("goodbye."); return; }
			else if (n1 == null){}
			
			int n2 = myReadInt("Enter n2: ");
			if (n2 == SENTINEL){ println("goodbye."); return; }
			
			println(n1 + n2);
		}
	}
	
	
	private Integer myReadInt(String prompt)
	{
		String numStr = readLine(prompt);
		int numStrToInt;
		try {
			numStrToInt = Integer.parseInt(numStr);
		} catch (NumberFormatException e) { 
			println(e);
			return null;
		}
		return numStrToInt;
	}
}