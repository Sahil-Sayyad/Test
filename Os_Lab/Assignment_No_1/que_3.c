/* 3. execlp() System Call.
*/


#include<sys/types.h>
#include<stdio.h>
#include<unistd.h>

int main(){
    int pid = fork();
    if(pid<0){
        fprintf(stderr,"Fork Failed");
        return 1;
    }else if(pid==0){
        execlp("/bin/wc", "wc", NULL);
    }else{
        wait(NULL);
        printf("Child Complete");
    }
    return 0;
}