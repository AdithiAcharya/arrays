#include <stdio.h>

int main() {
    int n, i, j, isUnique;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n]; 

    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("The array elements are:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    printf("\nUnique elements in the array are:\n");
    for (i = 0; i < n; i++) {
        isUnique = 1;

        for (j = 0; j < n; j++) {
            if (i != j && arr[i] == arr[j]) {
                isUnique = 0; 
                break;
            }
        }

        if (isUnique) {
            printf("%d ", arr[i]);
        }
    }

    return 0;
}
