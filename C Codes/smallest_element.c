#include <stdio.h>

int main(){
    int n;
    int i;
    printf("Enter array size: ", n);
    if(scanf("%d", &n)!= 1 || n <= 0){
        return 0;
    }

    int arr[n];
    for(i=0; i<n; i++){
        printf("Enter Element %d: ", i+1);
        scanf("%d", &arr[i]);
    }

    int min= arr[0];
    for(i=1; i<n; i++){
        if(arr[i]< min){
            min = arr[i];
        }
    }

    printf("Smallest Element: %d\n", min);
    return 0;
}