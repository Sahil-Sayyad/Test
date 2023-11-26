# Write a R program to sort a list of strings in 
# ascending & descending Order.

stud_name = c("Rushab", "Rohit", "Sahil")
print(stud_name)
cat("Names in ascending Order ", sort(stud_name) , "\n")
cat("Names in dscending Order ", sort(stud_name,decreasing = TRUE))

# [1] "Rushab" "Rohit"  "Sahil" 
# Names in ascending Order  Rohit Rushab Sahil 
# Names in dscending Otrder  Sahil Rushab Rohit