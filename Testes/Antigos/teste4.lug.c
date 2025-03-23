#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main() {
float i;
float j;
float li;
float lj;
i = 0.0;
j = 0.0;
li = 3.0;
lj = 5.0;
while (i < li) {
j = 0.0;
while (j < lj) {
printf("%f\n", i * 10.0 + j);
j = j + 1.0;
}
i = i + 1.0;
}
printf("%f\n", 100.0);
	return 0;
}
