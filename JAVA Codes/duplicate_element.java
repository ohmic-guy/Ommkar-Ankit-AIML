import java.util.Scanner;

class duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
		int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] unique = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[newSize] = arr[i];
                newSize++;
            }
        }

        System.out.print("Array after removing duplicate elements: ");
        for (int i = 0; i < newSize; i++) {
		System.out.print(unique[i]+" ");
        }
    }
}
