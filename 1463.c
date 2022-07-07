
#include <stdio.h>
int count=0;

int mod3(int a) {
    a= a/3;
    count++;
    return a;
}
int mod2(int a) {
    a= a/2;
    count++;
    return a;
}
int sub(int a) {
    a= a-1;
    count++;
    return a;
}

int main() {
    int n;
    scanf("%d",&n);
    while(n!=1) {

        if(n%3==0) {
            n=mod3(n);
            printf("%d---%d\n",n,count);
        } else if(n%2==0) {
            n=mod2(n);
            printf("%d---%d\n",n,count);
        } else if((n-1)%3==0) {
            n=n-1;
            count++;
            printf("%d---%d\n",n,count);
        }  else {
            n=n-1;
            count=count+1;
            printf("%d---%d\n",n,count);
        }
    }
    
    printf("%d",count);
    return 0;
}
