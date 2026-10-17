from functools import reduce

consumption = [8, 12, 9, 15, 7, 11]

# Identify days with consumption above 10 units
high_consumption = list(
    filter(lambda x: x > 10, consumption)
)
print("High consumption:", high_consumption)

# Calculate daily cost
costs = list(map(lambda x: x * 6, consumption))
print("Daily costs:", costs)

# Calculate total consumption
total = reduce(lambda x, y: x + y, consumption, 0)
print("Total consumption:", total)

# Pure function to calculate the bill
def electricity_bill(units):
    return units * 6

print("Total bill: Rs.", electricity_bill(total))
