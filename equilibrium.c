#include <stdio.h>
int main() {
    int n, i,in;
    printf("Enter the length of array:\n");
    scanf("%d", &n);
    int a[n];
    printf("Enter the elements of the array (must be sorted!):\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    printf("Enter the index :\n");
    scanf("%d", &in);
    int ls = 0;
    int rs = 0;
    for(i=0;i<in;i++){
        ls = ls + a[i];
    }
    printf("Left Sum : %d\n",ls);

    for(i=in+1;i<n;i++){
        rs = rs + a[i];
    }
    printf("Right Sum : %d\n",rs);
    if(ls == rs){
        printf("Equilibrium\n");
    }
    else{
        printf("Not Equilibrium\n");
    }
    return 0;
}
