/*write a program to find the execution time taken for execution of given 
  set of instruction (Hint : Use clock() function) this function clock() 
  is called at the beginning of program and again at the end of the program 
  and the difference b/w the values returened gives the time spent by 
  processer on the program. */

  #include<stdio.h>
  #include<time.h>

  int main(){
    clock_t start_t, end_t;
    start_t = clock();
    printf("starting of the program start_t = %lu\n", start_t);
    double total_t;
    int i ;
    for(i = 0; i < 1000000000;i++){

    }
    end_t = clock();
    printf("End of the program end_t= %lu\n", end_t);

    total_t = (double) (end_t- start_t)/ CLOCKS_PER_SEC;
    printf("Total Time Taken By CPU = %f\n",total_t);
    printf("Exiting the program .....\n");

    return 0;
  }