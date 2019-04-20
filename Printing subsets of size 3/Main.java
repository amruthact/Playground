#include<stdio.h>
int main()
{
  //Type your code here int size;
  int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
  for(int index1=0;index1<=size-2;index1++)
  {
      for(int index2=index1+1;index2<=size-1;index2++)
      {
          for(int index3=index2+1;index3<=size-1;index3++)
          {
            printf("(%d, %d, %d) ",arr[index1],arr[index2],arr[index3]);
          }
      }
    printf("\n");
  }
  
  return 0;
}