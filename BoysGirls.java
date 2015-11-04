import java.util.Scanner;

public class IntDataType {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		
		int girls, boys, people, remainder;
		girls = 11;
		boys = 5;
		people = girls / boys;
		remainder = girls % boys;
		System.out.println(people);
		System.out.print("With remainder of ");
		System.out.println(remainder);
	}
}
