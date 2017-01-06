#include<stdio.h>

main()
{
    int number, qtHoras;
    float salary, horas;
    scanf("%d", &number);
    scanf("%d", &qtHoras);
    scanf("%f", &horas);
    salary=horas*qtHoras;

    printf("NUMBER = %d\n" ,  number);
    printf("SALARY = U$ %3.2f\n", salary);
}
