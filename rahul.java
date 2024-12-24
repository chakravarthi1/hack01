package dec14;
import java.util.Scanner;
public class rahul {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter no. of colonies-->");
		        int col = sc.nextInt();
		        System.out.println("enter no.of buildings-->");
		        for (int c = 0; c < col; c++) {
		            int n = sc.nextInt();
		            System.out.println("earnings per building-->");
		            int epb = sc.nextInt();
		            System.out.println("heights of the buildings-->");
		            int[] hgts = new int[n];
		            for (int i = 0; i < n; i++) {
		                hgts[i] = sc.nextInt();
		            }
		            int vb = 0;
		            int maxSeenHgt = 0;
		            for (int i=0;i<n;i++) {
		                if (hgts[i] > maxSeenHgt) {
		                    vb++;
		                    maxSeenHgt = hgts[i];
		                }
		            }
		            int salary = vb * epb;
		            System.out.println("earnings are--->"+salary);
		        }
		        return;
		    } 
	}


