#include<stdio.h>

main()
{
    double N;
    int notas_100, notas_50, notas_20, notas_10, notas_5, notas_2;
    int moeda_1, moeda_050, moeda_025, moeda_010, moeda_005, moeda_001;
    int N_int;

    scanf("%lf", &N);

    N_int = N*100;

    notas_100 = N_int/(100*100);
    N_int = N_int%(100*100);

    notas_50 = N_int/(100*50);
    N_int = N_int%(100*50);

    notas_20 = N_int/(100*20);
    N_int = N_int%(100*20);

    notas_10 = N_int/(100*10);
    N_int = N_int%(100*10);

    notas_5 = N_int/(100*5);
    N_int = N_int%(100*5);

    notas_2 = N_int/(100*2);
    N_int = N_int%(100*2);

    moeda_1 = N_int/(100*1);
    N_int = N_int%(100*1);

    moeda_050 = N_int/50;
    N_int = N_int%50;

    moeda_025 = N_int/25;
    N_int = N_int%25;

    moeda_010 = N_int/10;
    N_int = N_int%10;

    moeda_005 = N_int/5;
    N_int = N_int%5;

    moeda_001 = N_int/1;
    N_int = N_int%1;

    printf("NOTAS:\n");
    printf("%i nota(s) de R$ 100.00\n", notas_100);
    printf("%i nota(s) de R$ 50.00\n", notas_50);
    printf("%i nota(s) de R$ 20.00\n", notas_20);
    printf("%i nota(s) de R$ 10.00\n", notas_10);
    printf("%i nota(s) de R$ 5.00\n", notas_5);
    printf("%i nota(s) de R$ 2.00\n", notas_2);

    printf("MOEDAS:\n");
    printf("%i moeda(s) de R$ 1.00\n", moeda_1);
    printf("%i moeda(s) de R$ 0.50\n", moeda_050);
    printf("%i moeda(s) de R$ 0.25\n", moeda_025);
    printf("%i moeda(s) de R$ 0.10\n", moeda_010);
    printf("%i moeda(s) de R$ 0.05\n", moeda_005);
    printf("%i moeda(s) de R$ 0.01\n", moeda_001);
}
