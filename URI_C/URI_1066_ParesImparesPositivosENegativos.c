#include<stdio.h>

int main(void)
{
   int V,Rod,Pos = 0,Neg = 0,Imp = 0,Par = 0;

   for(Rod = 0;Rod < 5;Rod ++){
      scanf("%i",&V);
      if (V > 0){
         Pos++;
      }
      if(V < 0){
         Neg++;
      }
      if(V % 2 == 0){
         Par++;
      }
   else{
         Imp++;
      }
   }
   printf("%i valor(es) par(es)\n",Par);
   printf("%i valor(es) impar(es)\n",Imp);
   printf("%i valor(es) positivo(s)\n",Pos);
   printf("%i valor(es) negativo(s)\n",Neg);
}
