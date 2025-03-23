#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool ehPrimo(int num) {
int i;
bool primo;
int temp;
primo = true;
if (num < 2.0) {
primo = false;
}
i = 2.0;
while (i < num) {
temp = num;
while (temp > i) {
temp = temp - i;
}
if (temp == i) {
primo = false;
}
i = i + 1.0;
}
return primo;
}

int main() {
int num;
float resultado;
bool primo;
num = 7.0;
primo = ehPrimo(num);
if (primo) {
resultado = 1.0;
}
printf("%f\n", resultado);
	return 0;
}
