
import socket

# Create UDP socket
server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# Bind server to IP and port
server.bind(("localhost", 12346))

print("UDP Server waiting for temperature readings...")

while True:
    # Receive temperature from client
    data, addr = server.recvfrom(1024)

    temperature = data.decode()

    print("Temperature received:", temperature, "°C")
    print("From:", addr)

