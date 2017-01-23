#include<stdio.h>

main(){

int valcod, qtitem;
float total;
scanf("%d%d", &valcod, &qtitem);

if (valcod==1){
    total=qtitem*4.0;
    printf("Total: R$ %.2f\n", total);
    }
else{
        if(valcod==2){
          total=qtitem*4.50;
          printf("Total: R$ %.2f\n", total);
        }

        else{
            if(valcod==3){
                total=qtitem*5.00;
                printf("Total: R$ %.2f\n", total);
            }
            else{
                    if(valcod==4 ){
                    total=qtitem*2.00;
                    printf("Total: R$ %.2f\n", total);
                    }
                    else{
                        if(valcod==5 ){
                    total=qtitem*1.50;
                    printf("Total: R$ %.2f\n", total);
                    }

                }
            }
        }
    }
}
