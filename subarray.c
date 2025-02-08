#include <stdio.h>

int main() {
    int n, i, count = 0; 
    printf("Enter the length of array:\n");
    scanf("%d", &n);
    int a[n];
    printf("Enter the elements of the array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    for (i = 0; i < n; i++) { 
        if ((a[i] % 2 == 0 && a[i + 1] % 2 != 0) || (a[i] % 2 != 0 && a[i + 1] % 2 == 0)) {
            count++;
        }
    }
    printf("Length: %d\n", count); 

    return 0;
}
