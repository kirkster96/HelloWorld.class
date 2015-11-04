import java.util.Scanner;

public class IncreOperator {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int tuna = 5;
		int bass = 18;
		System.out.println(++tuna);
		//pre-incrementing operator
		System.out.println(tuna++);
		//post incrementing operator
		System.out.println(tuna);
		tuna += 5;
		//faster assignment operator
		System.out.println(tuna);
		
	}
	
	
}
