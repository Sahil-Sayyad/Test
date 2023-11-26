# Write a program to calculate sum of two matrix of given size.

A = matrix(c(1,2,3,4,5,6),nrow=2,ncol=3)
B = matrix(c(7,8,9,10,11,12),nrow=2,ncol=3)
num_of_rows = nrow(A)
num_of_cols = ncol(A)
add = matrix(nrow = num_of_rows, ncol=num_of_cols)
print(A)
print(B)
for(row in 1 : num_of_rows){
    for(cols in 1 : num_of_cols ){
        add[row,cols]=A[row,cols]+B[row,cols]
    }
}
print(add)

#      [,1] [,2] [,3]
# [1,]    1    3    5
# [2,]    2    4    6
#      [,1] [,2] [,3]
# [1,]    7    9   11
# [2,]    8   10   12
#      [,1] [,2] [,3]
# [1,]    8   12   16
# [2,]   10   14   18