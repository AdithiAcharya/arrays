#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    int len = strlen(str),flag = 0,n;
    printf("Enter the string : \n");
    scanf("%c",&str);
    for(int i=0;i<n/2;i++){
        if(str[i] == str[n-i-1]){
            flag = 1;
            break;
        }
    }
    if(flag){
        printf("Not palindrome\n");
    }
    else{
        printf("Palindrome\n");
    }
    return 0;
}
