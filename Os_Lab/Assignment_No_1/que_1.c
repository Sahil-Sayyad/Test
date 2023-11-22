//1.Run the given program and see the output. [use of getpid() function ].

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
int main(){
    int pid = fork();
    if(pid<0){
        printf("\nError in Creation of child Process");
        exit(1);
    }else if(pid==0){
        printf("Hello I am the child process" );
        printf("\n My Pid is %d ",getpid());
        exit(0);
    }else{
        printf("\n Hello , I am the parent process");
        printf("\n My Pid is %d", getpid());
        exit(0);
    }
}