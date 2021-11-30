package week1.day2;

public class CheckingTheNumber {
	
	public void positiveOrNegative(int x) {
		if (x<0) {
			System.out.println("The number is negative number");
		}
		else if (x>0) {
			System.out.println("The number is positive number");
		}
		else {
			System.out.println("The number is neither positive nor negative");
		}

	}
	
	public static void main(String[] args) {
		CheckingTheNumber pn =new CheckingTheNumber();
		pn.positiveOrNegative(5);
		
	}

}
