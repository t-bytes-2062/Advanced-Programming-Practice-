
import socket

# Create TCP socket
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect to server
client.connect(("localhost", 12345))

# Enter register number
reg_no = input("Enter register number: ")

# Send register number
client.send(reg_no.encode())

# Receive result
result = client.recv(1024).decode()

print("Examination Result:", result)

client.close()

