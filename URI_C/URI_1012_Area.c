#include<stdio.h>

main()
{
    float A, B, C, area_tri, area_cir, area_tra, area_quad, area_ret;

    scanf("%f", &A);
    scanf("%f", &B);
    scanf("%f", &C);

    area_tri=(A*C)/2;
    area_cir=3.14159*(C*C);
    area_tra=(C*(A+B))/2;
    area_quad=B*B;
    area_ret=A*B;

    printf("TRIANGULO: %.3f\n", area_tri);
    printf("CIRCULO: %.3f\n", area_cir);
    printf("TRAPEZIO: %.3f\n", area_tra);
    printf("QUADRADO: %.3f\n", area_quad);
    printf("RETANGULO: %.3f\n", area_ret);
}
