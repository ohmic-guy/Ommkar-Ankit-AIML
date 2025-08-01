#include <stdio.h>
int main (){
    int m, n, i, j, k=0, count=0;
    printf("Enter the number of rows of matrix 1 and 2: ");
    scanf("%d", &m);
    printf("Enter the number of cols of matrix 1 and 2: ");
    scanf("%d", &n);

    int arr[m][n], sparse[m*n][3];
    printf("Enter the elements of array 1!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("Enter the element at index [%d][%d]: ", i,j);
            scanf("%d", &arr[i][j]);
            if(arr[i][j] != 0){
                count++;
            }
        }
    }
    printf("\nElements of matrix 1!\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("%d\t", arr[i][j]);
        }
        printf("\n");
    }
    if(count > ((m*n)/2)){
        return -1;
    }
    else{
        sparse[0][0] = m;
        sparse[0][1] = n;
        sparse[0][2] = count;
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                if(arr[i][j] != 0){
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = arr[i][j];
                    k++;
                }
            }
        }
        printf("\nSparse matrix is:\n");
        printf("Row\tCol\tValue\n");
        for (i = 0; i < k; i++) {
            printf("%d\t%d\t%d\n", sparse[i][0], sparse[i][1], sparse[i][2]);
        }
            printf("\n");
    }
}