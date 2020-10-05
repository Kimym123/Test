#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void)
{
	int a, i, j;

	scanf("%d", &a);

	for (i = 1; i <= a; i++)
	{
		for (j = 0; j < a; j++)
		{
			if (j >= a - i)
				printf("*");
			else
			{
				printf(" ");
			}
		}
		printf("\n");

	}

	return 0;
}
