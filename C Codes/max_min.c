#include <stdio.h>

int main() {
    int n;
    int i;

    printf("Enter n value: ");
    if (scanf("%d", &n) != 1 || n <= 0)
        return 0;

    int arr[n];

    printf("Enter elements of array: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int min = arr[0];
    int max = arr[0];

    for (i = 1; i < n; i++) {
        if (arr[i] < min)
            min = arr[i];
        if (arr[i] > max)
            max = arr[i];
    }

    printf("Min = %d and Max = %d\n", min, max);
    return 0;
}
