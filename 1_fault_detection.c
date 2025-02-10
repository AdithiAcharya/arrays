#include <stdio.h>

int main() {
    int n, i;
    int fault = 0, count = 0;
    
    
    printf("Enter the number of sensors: ");
    scanf("%d", &n);

  
    int tsensor[n];

    
    printf("Enter the temperature readings of the sensors:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &tsensor[i]);
    }

    
    for (i = 0; i < n; i++) {
        if (tsensor[i] > 50) {
            fault = 1; 
            printf("Fault detected in sensor %d: %d degrees\n", i + 1, tsensor[i]);
        } else if (tsensor[i] < 20 || tsensor[i] > 40) {
            count++; 
        }
    }

    
    if (fault) {
        printf("There are faults in the readings.\n");
    } else {
        printf("There are no faults.\n");
    }


    return 0;
}
