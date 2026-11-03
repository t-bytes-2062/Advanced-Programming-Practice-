
import socket

# Create UDP socket
client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

while True:
    temperature = input("Enter temperature (or exit): ")

    if temperature.lower() == "exit":
        break

    # Send temperature to server
    client.sendto(
        temperature.encode(),
        ("localhost", 12346)
    )

    print("Temperature sent successfully.")

client.close()

