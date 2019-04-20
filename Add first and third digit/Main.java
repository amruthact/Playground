#include<stdio.h>
int main()
{
  //Type your code here
  int num,a,b,s;
  scanf("%d",&num);
  a=num/100;
  b=num%10;
  s=a+b;
  printf("%d",s);
  return 0;
}