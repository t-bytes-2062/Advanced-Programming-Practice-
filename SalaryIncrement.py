from functools import reduce

salaries = [30000, 45000, 35000, 50000, 25000]

# Identify eligible employees
eligible = list(filter(lambda s: s < 40000, salaries))
print("Eligible salaries:", eligible)

# Increase eligible salaries by 10%
revised = list(map(
    lambda s: s * 1.10 if s < 40000 else s,
    salaries
))
print("Revised salaries:", revised)

# Calculate total salary expenditure
total = reduce(lambda x, y: x + y, revised, 0)
print("Total salary expenditure:", total)
