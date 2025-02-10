#include <stdio.h>

int main() {
    int n, i;

  
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    if (n < 2) {
        printf("At least two elements are required.\n");
        return 0;
    }

    int arr[n]; 
    
    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int max = arr[0], smax = -1;

    for (i = 1; i < n; i++) {
        if (arr[i] > max) {
            smax = max;  
            max = arr[i]; 
        } else if (arr[i] != max && (smax == -1 || arr[i] > smax)) {
            smax = arr[i];  
        }
    }
    printf("The maximum number is: %d\n", max);
    
    if (smax != -1) {
        printf("The second largest number is: %d\n", smax);
    } else {
        printf("No second largest number found (all elements might be the same).\n");
    }

    return 0;
}

