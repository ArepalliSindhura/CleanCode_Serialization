package epam.CleanCode_Serialization;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Interest {
	
	public static void InterestCalculation(){
		Scanner sc = new Scanner(System.in);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
			p.println("enter the principal");
			float amount = sc.nextInt();
			p.println("enter the time");
			int time = sc.nextInt();
			p.println("enter the rate");
			int rate = sc.nextInt();
			p.println("Simple interest is " + ((amount * time * rate)/100));
			p.println("Compound interest is " + ((amount * Math.pow(1 + (rate/100), time)) - amount));
	}

}
