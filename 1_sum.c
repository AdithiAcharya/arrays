#include <stdio.h>

int main() {
    int n, i;

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

    int sum = 0;
    for (i = 0; i < n; i++) {
        sum += arr[i];
    }
    
    printf("\nSum of array elements: %d\n", sum);

    return 0;
}
