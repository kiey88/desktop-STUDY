#include <stdio.h>

int main() {
    int i = 0;
    int sum = 0;

    while (i < 5) {
        if (i % 2 == 0) {
            continue;
        }
        printf("%d ", i);
        sum += i;
        i++; // 이 부분을 printf 문 밑으로 이동시킵니다.
    }

    printf("\n i = %d", i);
    printf("\n sum = %d", sum);

    return 0;
}
