#include<stdio.h>
int s(int num);
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  printf("%d",s(n));
   return 0;
}
int s(int num)
{
  int result=num*num;
  return result;
}