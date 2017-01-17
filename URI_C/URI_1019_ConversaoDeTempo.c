#include<stdio.h>
#include<math.h>

main()
{
    int N, horas, minutos, segundos;

    scanf("%i", &N);

    horas = N/3600;
    N = N%3600;

    minutos = N/60;
    N = N%60;

    segundos = N;

    printf("%i:%i:%i\n", horas, minutos, segundos);
}
