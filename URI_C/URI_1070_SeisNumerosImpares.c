#include<stdio.h>

int main()
{
    int n,x;

    scanf("%d", &n);

    for(x=n; x<(n+12); x++){

        if(x%2!=0){
            printf("%d\n", x);
        }
    }
}
