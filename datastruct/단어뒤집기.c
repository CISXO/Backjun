#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char stack[1001];
int top=0;
void push(char s) {
    if(top>= 1001) {

    } else {
        stack[top] = s;
        top++;
    }
}

void pop() {
    if (top >=1001 || top<=0) {
    } else {
        printf("%c",stack[top-1]);
        stack[top-1] = 0;
        top--;
    }
}
void push_word(char *s) {
    int count = 0;
    count = strlen(s);
    for(int i=0;i<count;i++) {
        push(s[i]);
    }
    for(int i=0;i<count;i++) {
        pop();
    }
    printf(" ");
    
}

int main() {
    int num;
    char p[1001];
    scanf("%d", &num);
    getchar();
    for(int i=0;i<num;i++) {
    fgets(p,1001, stdin);
    p[strlen(p)-1]='\0';
    char *temp = strtok(p," ");
    
    while(temp != NULL) {
        push_word(temp);
        temp= strtok(NULL, " ");
    }
        
    }
    return 0;
}


