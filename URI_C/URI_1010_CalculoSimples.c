#include<stdio.h>
#include<math.h>

int main()
{
    int cod1,cod2,q1,q2;
    float p1,p2,total,total1,total2;

    scanf("%d" "%d" "%f",&cod1,&q1,&p1);
    scanf("%d" "%d" "%f",&cod2,&q2,&p2);

    total1=q1*p1;
    total2=q2*p2;

    total=total1+total2;

    printf("VALOR A PAGAR: R$ %.2f\n",total);
}
