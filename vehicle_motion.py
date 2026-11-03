
import sympy as sp

# Define symbolic variable
t = sp.symbols('t')

# Define displacement function
s = t**3 - 6*t**2 + 9*t + 5

# Calculate velocity
v = sp.diff(s, t)

# Calculate acceleration
a = sp.diff(v, t)

print("Displacement:", s)
print("Velocity:", v)
print("Acceleration:", a)

# Find time when vehicle is at rest
rest_time = sp.solve(v, t)

print("Vehicle at rest at:", rest_time)

# Calculate definite integration from 0 to 3
result = sp.integrate(s, (t, 0, 3))

print("Definite integral:", result)

# Calculate net displacement
net_displacement = s.subs(t, 3) - s.subs(t, 0)

print("Net displacement:", net_displacement)

