#include <stdio.h>

int main() {
    int n, i;
    int flag=0;
    
    printf("Enter the number of registrations: ");
    scanf("%d", &n);

    int a[i];
    printf("Enter the registrations:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    int id;
    printf("new user entry\n");
    printf("enter the new user\n");
    scanf("%d",&id);
    for(int i=0;i<n;i++)
    {
        if(id == a[i])
        {
            printf("the user already exists\n");
            flag = 1;
            break;
        }
    }
    if(flag == 0)
    {
        printf("the user is available for registration\n");
    }
    return 0;
}
