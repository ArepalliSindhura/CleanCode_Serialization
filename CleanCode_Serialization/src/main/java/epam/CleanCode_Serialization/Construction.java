package epam.CleanCode_Serialization;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {

	public static void Cost() {
		int ch;
		float area;
		float cost;
		Scanner sc = new Scanner(System.in);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
			p.println("Construction cost Quotation ");
			p.println("What is the area of the house? ");
			area = sc.nextInt();
			p.println("The materials available are ");
			p.println("1.Standard materials");
			p.println("2.Above standard material");
			p.println("3.High Standard materials");
			p.println("4.High standard material and fully automated");
			p.println("enter an option");
			ch = sc.nextInt();
			switch(ch){
			case 1:
				
			}
	}

}
