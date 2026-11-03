
import sympy as sp

# Define symbolic variables
x, y = sp.symbols('x y')

# 1. Expand an expression
expr = (x + 2)**2
expanded = sp.expand(expr)

print("Original expression:", expr)
print("Expanded expression:", expanded)

# 2. Factorize an expression
expr2 = x**2 + 5*x + 6
factorized = sp.factor(expr2)

print("Original expression:", expr2)
print("Factorized expression:", factorized)

# 3. Simplify an expression
expr3 = (x**2 - 1) / (x - 1)
simplified = sp.simplify(expr3)

print("Original expression:", expr3)
print("Simplified expression:", simplified)

# 4. Solve quadratic equation
equation = x**2 - 5*x + 6
solution = sp.solve(equation, x)

print("Quadratic equation:", equation, "= 0")
print("Solutions:", solution)

