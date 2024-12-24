package dec14;

import java.util.Scanner;

public class exp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data= sc.nextLine();
		
		int[] count = {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
				};
		char ch = ' ';
		int index;
		String result="";
		for(int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch >='A' && ch <='Z') {
				
				index = (int)(ch -65);
				System.out.print(ch+"   ");
				count[index]++;
				System.out.println("<--uppercase");
			}
			else if(ch >='a' && ch <='z') {
				
				index = (int)(ch -97);
				System.out.print(ch+"   ");
				count[index]++;
				System.out.println("<--lower case");
				
			}
				
			}

		}
	}






