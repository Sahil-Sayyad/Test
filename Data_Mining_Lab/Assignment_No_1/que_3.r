# Write a script a R to create a list of employee(name) & perform the 
# following operation:
# a)Display name of employee in the list.
# b)Add on employee at end of the list.
# c)Remove third element of the list.

list_data = list("Zoro", "Rohit","Sahil","Rushab")
print(list_data)
new_emp = "Robin"
list_data = append(list_data,new_emp)
print(list_data)
list_data[-3]

# [[1]]
# [1] "Zoro"

# [[2]]
# [1] "Rohit"

# [[3]]
# [1] "Sahil"

# [[4]]
# [1] "Rushab"

# [[1]]
# [1] "Zoro"

# [[2]]
# [1] "Rohit"

# [[3]]
# [1] "Sahil"

# [[4]]
# [1] "Rushab"

# [[5]]
# [1] "Robin"

# [[1]]
# [1] "Zoro"

# [[2]]
# [1] "Rohit"

# [[3]]
# [1] "Rushab"

# [[4]]
# [1] "Robin"
