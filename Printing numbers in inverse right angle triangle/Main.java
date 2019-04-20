#include <stdio.h>
int main() {
    // Type your code here
    int n;
    scanf("%d", &n);
	int val = n;
	for(int curr_row = 1; curr_row <= n; curr_row++)
	{
        // Handle space for each row
	   // for(int space = 1; space <= (n - curr_row); space++){
	      //  printf(" ");
	   // }
        // Handle numbers for each row
	    for(int curr_col = val; curr_col >=1; curr_col--)
	    {
	        printf("%d", curr_col);
	        //val++;
	    }
      val--;
	    printf("\n");
	}
	return 0;
}