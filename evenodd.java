import java.util.Scanner;

class Students {
	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();

		if(x%2==0) {
			System.out.println("Even");
			}
		
		else {
			System.out.println("Odd");
		}
	}
}