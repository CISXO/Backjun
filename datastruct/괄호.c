#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char stack[51];
int top=0;
void push(char s) {
    if(top>= 51) {

    } else {
        stack[top] = s;
        top++;
    }
}

void pop() {
    if (top >=51||top<0) {
    } else {
//        printf("%c",stack[top-1]);
        stack[top-1] = 0;
        top--;
    }
}


void push_word(char *s) {
    int count = 0;
    int check = 0;
    count = strlen(s);
    
    for(int i=0;i<count;i++) {
        if(s[i]=='(') {
        push(s[i]);
        } else if(s[i]==')') {
            if(top==0) {
                check=-1;
            } else {
            pop();
            }
        }
    }
    
    if(check==-1) {
        printf("NO\n");
    } else if(top==0) {
        printf("YES\n");
    } else {
        printf("NO\n");
    }
    for(int i=0;i<top;i++) {
        stack[i]=0;
    }
    top=0;
}


int main() {
    int n;
    scanf("%d",&n);
    
    getchar();
    char p[52];
        for(int i=0;i<n;i++) {
            fflush(stdin);
        fgets(p,52,stdin);               //fgets  입력할 배열, 싸이즈, 입력방식
        p[strlen(p)-1]='\0';
            push_word(p);
            
        }
            
    return 0;
}

