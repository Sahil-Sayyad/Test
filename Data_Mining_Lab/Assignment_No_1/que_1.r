# Write a R program to add , multi , sub, div of two vectors of integer type 
# (vector length should be minimum 4)

vector1 = seq(10,40,length.out=4)
vector2 = c(20,10,40,40)
print("Original vector : ")
print(vector1)
print(vector2)
add = vector1 + vector2
cat("Sum of two vectors is : ", add, "\n")
multi = vector1 * vector2
cat("Multiplication of two vector is : ", multi,"\n")
sub = vector1 - vector2
cat("Subtraction of two vector is : ", sub, "\n")
div = vector1 / vector2 
cat("Division of two vector is : ", div, "\n")

# [1] "Original vector : "
# [1] 10 20 30 40
# [1] 20 10 40 40
# Sum of two vectors is :  30 30 70 80 
# Multiplication of two vector is :  200 200 1200 1600 
# Subtraction of two vector is :  -10 10 -10 0 
# Division of two vector is :  0.5 2 0.75 1 
