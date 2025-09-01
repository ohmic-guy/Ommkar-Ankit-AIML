import java.util.Scanner;

class GradeCalculation{
	public static void main (String[]args){
		int total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total mark: ");
		total = sc.nextInt();
		calculate_grade(total);
	}
	
	public static void calculate_grade(int t){
		if (t >= 360)
			System.out.println("Grade O");
		else if (t >= 250)
			System.out.println("Grade E");
		else if (t >= 140)
			System.out.println("Grade A");
		else
			System.out.println("Grade F");
	}
}