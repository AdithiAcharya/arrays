#include <stdio.h>
int main() {
    int n, i, l = 0,e;
    printf("Enter the length of array:\n");
    scanf("%d", &n);
    int a[n];
    printf("Enter the elements of the array (must be sorted!):\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    printf("Enter the element to be searched: ");
    scanf("%d", &e);

    int h = n;

    while (l < h) {
        int mid = (l + h) / 2;

        if (a[mid] == e) {
            printf("Element found at index %d\n", mid);
            return 0;
        } else if (a[mid] < e) {
            l = mid;
        } else {
            h = mid;
        }
    }

    printf("Element not found in the array.\n");
    return 0;
}
