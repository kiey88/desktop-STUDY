#include<stdio.h>
int add(int x, int y)
{
	int sum = x + y;
	return sum;
}

int main(void)
{
	printf("%d", add(5,3));
	printf("%d", add(2,3));
}
