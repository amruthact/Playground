#include<stdio.h>
int main()
{
        // Get the array size
        int arr_size;
        scanf("%d",&arr_size);
        int arr[10];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        // Get the searching element 1
        int m;
  if(arr[0]>arr[1])
  {
    m=arr[0];
  }
  else{
    m=arr[1];
  }
        // scan each element in an array
        // If element 1 and element 2 found, then store the index value 
        // Otherwise it will search till it reaches the arr_size - 1
        for(int idx = 2; idx <= arr_size - 1; idx++)
        {
            if(m <arr[idx])
            {
                m= arr[idx];
            }
           
        }
        printf("%d\n",m);
       
    return 0;
}