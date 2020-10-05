#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void)
{
	int A = 0, B = 0, C = 0;
	scanf("%d%d", &A, &B);
	scanf("%d", &C);

	B = B + C;
	if (B >= 59)
	{
		int X = B / 60;
		B = B % 60;
		A += X;
		if (A > 23)
		{
			A = A % 24;
		}
	}

	printf("%d %d", A, B);

	return 0;
}
