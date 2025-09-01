import java.util.Scanner;

class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = calculateGreatest(a, b);
		System.out.println("The greatest number is: " + c);
    }

    public static int calculateGreatest(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }
}