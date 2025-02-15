#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void rotateLeft(int d, int n, int arr[]) {
    d = d % n; // In case d is greater than n
    int *rotatedArray = (int*)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++) {
        rotatedArray[i] = arr[(i + d) % n];
    }

    // Output the rotated array
    for (int i = 0; i < n; i++) {
        printf("%d", rotatedArray[i]);
        if (i != n - 1) {
            printf(" ");
        }
    }
    printf("\n");
    
    free(rotatedArray);
}

int main() {
    int n, d;
    scanf("%d %d", &n, &d);
    
    int *arr = (int*)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    rotateLeft(d, n, arr);

    free(arr);
    return 0;
}
