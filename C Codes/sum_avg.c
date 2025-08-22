#include <stdio.h>

int main() {
    int n;
    int i;

    printf("Enter array size: ");
    if(scanf("%d", &n) != 1 || n <= 0){
        return 0;
    }

    int arr[n];
    long long sum = 0;

    for(i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &arr[i]);
        sum += arr[i];
    }

    double avg = (double)sum / n;

    printf("Sum = %lld, Average = %.2f\n", sum, avg);
    return 0;
}
