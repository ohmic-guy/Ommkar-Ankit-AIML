import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        int num, originalNum, rev = 0;

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        originalNum = num;

        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        if (rev == originalNum)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");

        sc.close();
    }
}
