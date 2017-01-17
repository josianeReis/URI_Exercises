#include<stdio.h>

main()
{
    int N, anos, meses, dias;
    scanf("%i", &N);

    anos = N/365;
    N = N%365;

    meses = N/30;
    N = N%30;

    dias = N;

    printf("%i ano(s)\n%i mes(es)\n%i dia(s)\n", anos, meses, dias);
}
