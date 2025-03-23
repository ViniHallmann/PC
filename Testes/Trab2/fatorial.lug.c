#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int fatorial(int n) {
int resultado;
resultado = 1.0;
while (n > 0.0) {
resultado = resultado * n;
n = n - 1.0;
}
return resultado;
}

int main() {
int num;
float resultado;
num = 5.0;
resultado = fatorial(num);
printf("%f\n", resultado);
	return 0;
}
