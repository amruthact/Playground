#include<stdio.h>
int isprime(int m);
int main(){
    // Type your code here
 int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    if(isprime(i))
    {
      printf("%d\n",i);
    }
  }
  return 0;
}
int isprime(int m)
{
  int isprime=1;
   for(int j=2;j<=m/2;j++)
   {
     if(m%j==0)
     {
       isprime=0;
       break;
     }
   }
  return isprime;
}