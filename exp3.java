package dec14;

import java.util.Scanner;

public class exp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data= sc.nextLine();
		data = data.toLowerCase();
		
		int[] count = {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
				};
		char ch = ' ';
		int index;
		for(int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch >='a' && ch <='z') {
				index = (int)(ch -97);
				count[index]++;
			}
		}
		for(int i=0;i<26;i++) {
			if(count[i] > 0)
			System.out.println("["+(char)(i+97)+"]--->"+count[i]);
		}
	}


	}


