#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int max(int x, int y) {
if (x > y) {
return x;
}
}

int main() {
int a;
int b;
int maior;
int contador;
a = 15.0;
b = 20.0;
contador = 0.0;
if (a > b) {
maior = a;
}
while (contador < maior) {
printf("%f\n", contador);
contador = contador + 1.0;
}
printf("%f\n", contador);
	return 0;
}
