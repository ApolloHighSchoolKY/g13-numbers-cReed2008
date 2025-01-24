//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(test);
		System.out.println("odd count = "+test.countOdds());
		System.out.println("even count = "+test.countEvens());
		System.out.println("perfect count = "+test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer test2 = new NumberAnalyzer("6 6 6 6 6 6 6 6");
		System.out.println(test2);
		System.out.println("odd count = "+test2.countOdds());
		System.out.println("even count = "+test2.countEvens());
		System.out.println("perfect count = "+test2.countPerfects()+"\n\n");

		//add more test cases
		NumberAnalyzer test3= new NumberAnalyzer("6 7 8 9 10 11 12 13");
		System.out.println(test3);
		System.out.println("odd count = "+test3.countOdds());
		System.out.println("even count = "+test3.countEvens());
		System.out.println("perfect count = "+test3.countPerfects()+"\n\n");

	}
}