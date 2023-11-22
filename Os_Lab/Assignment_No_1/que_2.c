/*2.Create a child process using fork(). Display parent and child process id.
    Display parent and child process id. Child process will display the 
    message "Hello World" and the parent process should display "Hi".

 */
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

int main(){
    int pid = fork();
    if(pid<0){
        printf("\nError in creating processs");
        exit(0);
    }else if (pid==0){
        printf("\nHello World");
        printf(" Child Process id : %d ", getpid());
        exit(1);
    }else{
        printf("Hi ");
        printf("Parent Process id : %d", getpid());
        exit(1);
    }
    return 0;
}