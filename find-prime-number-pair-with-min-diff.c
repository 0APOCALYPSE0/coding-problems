/* Find pair of prime numbers with minimum difference */
#include<stdio.h>

int main(){
  int size;
  scanf("%d",&size);
  int arr[size];
  int prime[size];
  int pair[2];
  int k=0;
  for(int i=0; i<size; i++){
    scanf("%d",&arr[i]);
  }

  for(int i=0; i<size; i++){
      int count = 0;
    for(int j=2; j<=arr[i]; j++){
      if(arr[i] % j == 0){
        count++;
        if(arr[i] == j && count == 1){
          printf("prime : %d\n", arr[i]);
          prime[k] = arr[i];
          k++;
        }
      }
    }
  }

  int min = prime[1]-prime[0];
  pair[0] = prime[0];
  pair[1] = prime[1];
  for(int i=1; i<k-1; i++){
    if(prime[i+1]-prime[1] < min){
      min = prime[i+1]-prime[i];
      pair[0] = prime[i];
      pair[1] = prime[i+1];
    }
  }

  printf("Pair with min difference %d is: %d,%d",min, pair[0],pair[1]);

  return 0;
}