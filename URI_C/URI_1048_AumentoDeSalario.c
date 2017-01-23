#include<stdio.h>

main(){
double sal, salFinal; int percent;

scanf("%lf", &sal);

if(sal >= 0 && sal <=400)
    {
        percent = 15;
        salFinal = sal*15/100;
    }
    else if(sal>400 && sal<=800)
    {
         percent = 12;
        salFinal = sal*12/100;
    }
    else if(sal>800 && sal<=1200)
    {
       percent = 10;
        salFinal = sal*10/100;
    }
    else if(sal>1200 && sal<=2000)
    {
       percent = 7;
        salFinal = sal*7/100;
    }
    else if(sal >2000)
    {
        percent = 4;
        salFinal = sal*4/100;
    }

    printf("Novo salario: %.2lf\n", sal+salFinal);
    printf("Reajuste ganho: %.2lf\n", salFinal);
    printf("Em percentual: %d %%\n", percent);

}
