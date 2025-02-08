#include <stdio.h>

int main() {
    int n, i;
    int maxnum=0, maxindex=0,countaftermax=0;
    
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int a[i];
    printf("Enter the elements:\n");
    for (i = 0;i < n; i++) {
        scanf("%d", &a[i]);
    }
    
    for(int i=0;i<n;i++)
    {
        if(a[i]>maxnum)
        {
            maxnum=a[i];
            maxindex=i;
        }
    }
    
    for(int i=maxindex+1;i<n;i++)
    {
        countaftermax++;
    }
    if(countaftermax == 3)
    {
        printf("Debit 100 from maxnumber %d\n", maxnum-100);
    }
    else if(countaftermax >3)
    {
         printf("Debit 500 from maxnumber %d\n", maxnum-500);
    }
    else
    {
        printf ("the remaing numbers are %d\n",countaftermax);
    }
    return 0;
}
    
    
