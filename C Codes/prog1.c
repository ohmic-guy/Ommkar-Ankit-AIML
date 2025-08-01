#include <stdio.h>
int main (){
    int m, n, i, j;
    printf("Enter the number of rows of matrix 1 and 2: ");
    scanf("%d", &m);
    printf("Enter the number of cols of matrix 1 and 2: ");
    scanf("%d", &n);
    int arr1[m][n], arr2[m][n], arr3[m][n];
    printf("Enter the elements of array 1!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("Enter the element at index [%d][%d]: ", i,j);
            scanf("%d", &arr1[i][j]);
        }
    }
    printf("\nEnter the elements of array 2!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("Enter the element at index [%d][%d]: ", i,j);
            scanf("%d", &arr2[i][j]);
        }
    }
    printf("\nElements of matrix 1!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("%d\t", arr1[i][j]);
        }
        printf("\n");
    }
    printf("\nElements of matrix 2!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("%d\t", arr2[i][j]);
        }
        printf("\n");
    }
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            arr3[i][j]=(arr1[i][j] + arr2[i][j]);
        }
    }
    printf("Sum of matrix 1 & 2 is....\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("%d\t", arr3[i][j]);
        }
        printf("\n");
    }
}