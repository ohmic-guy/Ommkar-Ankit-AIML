import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter Value of b: ");
        int b = sc.nextInt();

        try{
            int diff = a-b;

            if (diff==0){
                throw new ArithmeticException("Error: a-b is zero. Division is not possible.");
            }

            double result = a/diff;
            System.out.println("Result= " + result);
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
