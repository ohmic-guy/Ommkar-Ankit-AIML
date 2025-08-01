#include <stdio.h>

#define MAX 100

void display(int arr[], int n) {
    int i;
    printf("Array: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n"); // Add newline for better output
}

int main() {
    int arr[MAX], n = 0, choice, pos, elem, i;

    printf("Enter initial number of elements: ");
    scanf("%d", &n);
    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    do {
        printf("\nMenu:\n");
        printf("1. Insert at beginning\n");
        printf("2. Insert at end\n");
        printf("3. Insert at position\n");
        printf("4. Delete at beginning\n");
        printf("5. Delete at end\n");
        printf("6. Delete at position\n");
        printf("7. Display\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (n >= MAX) {
                    printf("Array is full!\n");
                    break;
                }
                printf("Enter element to insert: ");
                scanf("%d", &elem);
                for (i = n; i > 0; i--)
                    arr[i] = arr[i-1];
                arr[0] = elem;
                n++;
                printf("Inserted at beginning.\n");
                break;

            case 2:
                if (n >= MAX) {
                    printf("Array is full!\n");
                    break;
                }
                printf("Enter element to insert: ");
                scanf("%d", &elem);
                arr[n] = elem;
                n++;
                printf("Inserted at end.\n");
                break;

            case 3:
                if (n >= MAX) {
                    printf("Array is full!\n");
                    break;
                }
                printf("Enter position (1 to %d): ", n+1);
                scanf("%d", &pos);
                if (pos < 1 || pos > n+1) {
                    printf("Invalid position!\n");
                    break;
                }
                printf("Enter element to insert: ");
                scanf("%d", &elem);
                for (i = n; i >= pos; i--)
                    arr[i] = arr[i-1];
                arr[pos-1] = elem;
                n++;
                printf("Inserted at position %d.\n", pos);
                break;

            case 4:
                if (n <= 0) {
                    printf("Array is empty!\n");
                    break;
                }
                for (i = 0; i < n-1; i++)
                    arr[i] = arr[i+1];
                n--;
                printf("Deleted at beginning.\n");
                break;

            case 5:
                if (n <= 0) {
                    printf("Array is empty!\n");
                    break;
                }
                n--;
                printf("Deleted at end.\n");
                break;

            case 6:
                if (n <= 0) {
                    printf("Array is empty!\n");
                    break;
                }
                printf("Enter position to delete (1 to %d): ", n);
                scanf("%d", &pos);
                if (pos < 1 || pos > n) {
                    printf("Invalid position!\n");
                    break;
                }
                for (i = pos-1; i < n-1; i++)
                    arr[i] = arr[i+1];
                n--;
                printf("Deleted at position %d.\n", pos);
                break;

            case 7:
                display(arr, n);
                break;

            case 8:
                printf("Exiting...\n");
                break;

            default:
                printf("Invalid choice!\n");
        }
    } while (choice != 8);

    return 0;
}