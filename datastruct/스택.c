#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_SIZE 100000
int stack[MAX_SIZE];
int top=0;

void push(int x) {
    if(top >= MAX_SIZE) {
       
    } else {
        stack[top]= x;
        top++;
           
    }
}

void pop() {
    if (top >=MAX_SIZE || top<=0) {
        printf("%d\n",-1);
    } else {
        printf("%d\n",stack[top-1]);
        stack[top-1] = 0;
        top--;
    }
}



int main() {
  
    int num = 0;
    char sta[10];
    scanf("%d",&num);
    
    for (int i = 0; i < num; i++) {
        scanf("%s", sta);
        if (strcmp(sta, "push") == 0) {
            int nu;
            scanf("%d", &nu);
            push(nu);
        }
        else if (strcmp(sta, "pop") == 0) {
            pop();
        }
        else if (strcmp(sta, "top") == 0) {
            if(top<=0) {
                printf("%d\n",-1);
            }else {
            printf("%d\n",stack[top-1]);
            }
        }
        else if (strcmp(sta, "size") == 0) {
            
            printf("%d\n",top);
            
        }
        else if (strcmp(sta, "empty") == 0) {
            if(top==0) {
                printf("%d\n",1);
            } else
                printf("%d\n",0);
        }
    }
    return 0;
    }

