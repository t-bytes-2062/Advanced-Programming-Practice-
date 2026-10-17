prices = [500, 1200, 2500, 800, 1500]

# Pure function
def discounted_price(price):
    if price > 1000:
        return price * 0.80
    return price

# Identify eligible products
eligible = list(filter(lambda p: p > 1000, prices))
print("Eligible products:", eligible)

# Apply discount to all products
discounted = list(map(discounted_price, prices))
print("Discounted prices:", discounted)

# Display original list
print("Original prices:", prices)
