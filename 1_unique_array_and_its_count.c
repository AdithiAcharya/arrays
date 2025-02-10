#include <stdio.h>

int main() {
    int n, i, j, count;
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Unique elements in the array: ");
    for (i = 0; i < n; i++) {
        count = 0; 
        for (j = 0; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++; // Count occurrences
            }
        }

        if (count == 1) { // it's unique
            printf("%d ", arr[i]);
        }
    }
    return 0;
}
