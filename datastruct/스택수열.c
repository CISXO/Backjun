#include <stdio.h>

int stack[100001];
int top=0,top2=0;
char stack1[200002];

void push(int a) {
    stack1[top2]='+';
    top2++;
    stack[top] = a;
    top++;
    
}
void pop() {
    top--;
    stack1[top2]='-';
    top2++;
}
int stack_() {
    return stack[top-1];
}

int main() {
    int i,pp;
    int stop=1;
    int n=0;
    scanf("%d",&n);
    int arr[n];
    for(int i=0; i<n; i++) {
        scanf("%d",&arr[i]);
        if(arr[i]>n||arr[i]<=0) {
            stop=0;
        }
    }
    for(i=0; i< arr[0]; i++) {
        push(i+1);
    }

    for(int j=0; j<n; j++) {
        pp=stack_();
        if(pp==arr[j]) {
            pop();
        } else {
            for(;i<arr[j];i++)
                push(i+1);

            pp=stack_();
            if(arr[j]!=pp) {
                stop=0;
                break;
            } else {
                pop();
            }
        }

    }

    if(stop==0) {
        printf("NO");
    } else {
    for(int i=0; i<n*2; i++) {
        printf("%c\n",stack1[i]);
    }
    }
    return 0;
}


