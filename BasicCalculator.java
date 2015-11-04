import java.util.Scanner;

public class BasicCalculator {
	public static void main (String args[]){
		Scanner x = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter 1st number: ");
		fnum = x.nextDouble();
		System.out.println("Enter 2nd number: ");
		snum = x.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);		
	}
}
