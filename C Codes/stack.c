#include <stdio.h>
#include <stdlib.h>

#define MAX 100

int stack[MAX];
int top = -1;
int i;

void push(int val){
    if(top == MAX-1){
        printf("STACK OVERFLOW!! Can't PUSH %d\n", val);
    }
    else{
        stack[++top] = val;
        printf("%d PUSHED to stack\n", val);
    }
}

void pop(){
    if(top == -1){
        printf("STACK UNDERFLOW!! Nothing to POP\n");
    }
    else{
        printf("%d popped from stack\n", stack[top--]);
    }
}

void peep(){
    if(top == -1){
        printf("EMPTY STACK!!\n");
    }
    else{
        printf("Top Element: %d\n", stack[top]);
    }
}

void display(){
    if(top == -1){
        printf("EMPTY STACK!!\n");
    }
    else{
        printf("Stack Elements from TOP to BOTTOM:\n");
        for(i = top; i >= 0; i--){
            printf("%d\n", stack[i]);
        }
    }
}

int main() {
    int choice, val;
    while(1) {
        printf("\nStack Operations Menu:\n");
        printf("1. Push\n2. Pop\n3. Peep\n4. Display\n5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                printf("Enter value to push: ");
                scanf("%d", &val);
                push(val);
                break;
            case 2:
                pop();
                break;
            case 3:
                peep();
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Exiting program.\n");
                exit(0);
            default:
                printf("Invalid choice! Please enter again.\n");
        }
    }
    return 0;
}
