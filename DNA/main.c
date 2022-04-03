#include <stdio.h>

int main(void) {
 
  FILE *file;
  file = fopen("rosalind_dna.txt","r");
  int A = 0;
  int G = 0;
  int C = 0;
  int T = 0;
  int i = 0;
  
  if(file != NULL){
    char string[1002] ;
    fgets(string,1003,file);
   
  while(string[i] != '\n'){    
      if(string[i] == 'A'){
        A++;
      }else if (string[i] == 'C'){
        C++;
      }else if (string[i] == 'G'){
        G++;
      }else if (string[i] == 'T'){
        T++;
      }else {
        printf("\n Algo errado : %c",string[i]);
      }
      i++;
    }    
  }else{
    printf("ponteiro nulo");
  }
   //  'A', 'C', 'G', and 'T'
  printf("%d %d %d %d",A,C,G,T);  
}