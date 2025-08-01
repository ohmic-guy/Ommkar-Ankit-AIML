#include <stdio.h>
int main (){
    int m, n, i, j;
    printf("Enter the number of rows of matrix 1 and 2: ");
    scanf("%d", &m);
    printf("Enter the number of cols of matrix 1 and 2: ");
    scanf("%d", &n);
    int arr1[m][n], diagonalsum=0;
    printf("Enter the elements of array 1!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("Enter the element at index [%d][%d]: ", i,j);
            scanf("%d", &arr1[i][j]);
            if(i==j){
                diagonalsum += arr1[i][j];
            }
        }
    }
    printf("\nElements of matrix 1!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("%d\t", arr1[i][j]);
        }
        printf("\n");
    }
    printf("\nSum of diagonal elements is: %d", diagonalsum);
    
    return 0;
}