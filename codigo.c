
#include <stdio.h>
#include <stdbool.h>
int main(void)
{	int x;
	int y;
	float z;
	int w;
	z = 420;
	printf("%f", z);
	bool boolean;
	printf("\nEscriba el número 20\n");
	scanf("%d", &x);
	printf("Escriba un número aleatorio mayor o menor de 30\n");
	scanf("%d", &y);
	if(x==20)
	{
	
	boolean = true;
	}
	else
	{
	
	boolean = false;
	}
	if(boolean && y<30)
	{
	
	printf("\nHa escrito 20 y su segundo número es menor que 30");
	}
	else if(boolean && y>=30)
	{
	
	printf("\nHa escrito 20 y su segundo número es mayor que 30");
	}
	else if(boolean!=true && y<30)
	{
	
	printf("\nUsted no ha escrito el número 20 y el segundo número es menor que 30");
	}
	else if(boolean!=true && y>=30)
	{
	
	printf("\nUsted no ha escrito el número 20 y el segundo número es mayor que 30");
	}
	printf("\nCuantas veces quiere repetir la palabra 'gatito'\n");
	scanf("%d", &w);
	while(w>0)
	{
	
	printf("\ngato\n");
	
	w = w-1;
	}	return 0;
}
