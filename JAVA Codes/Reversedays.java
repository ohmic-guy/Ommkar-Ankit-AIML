public class Reversedays {
    public static void main(String[] args) {
        String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";

        String[] dayArray = days.split(" ");

        StringBuilder reversedDays = new StringBuilder();

        for (int i = dayArray.length - 1; i >= 0; i--) {
            reversedDays.append(dayArray[i]).append(" ");
        }

        days = reversedDays.toString().trim();

        System.out.println("Reversed :"+ days);
    }
}

