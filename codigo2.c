
#include <stdio.h>
#include <stdbool.h>
int main(void)
{	int x;
	int y;
	int z;
	x = 500;
	y = 490;
	z = x-y;
	if(z==10)
	{
	
	printf("El valor de Z es: ");
	
	printf("%d", z);
	
	while(z!=0)
	{
	
	z = z-1;
	
	printf("\nEl valor de Z es: ");
	
	printf("%d", z);
	}	
	printf("\n");
	}
	return 0;
}
