from functools import reduce

marks = [45, 67, 38, 89, 95, 50]

# Filter students scoring 50 or above
passed = list(filter(lambda x: x >= 50, marks))
print("Passed marks:", passed)

# Add 5 grace marks, maximum 100
updated = list(map(lambda x: min(x + 5, 100), marks))
print("Updated marks:", updated)

# Calculate total marks
total = reduce(lambda x, y: x + y, updated, 0)
print("Total marks:", total)
