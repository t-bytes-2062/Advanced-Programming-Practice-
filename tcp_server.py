
import socket

# Student database
students = {
    "101": "95 marks - PASS",
    "102": "87 marks - PASS",
    "103": "42 marks - PASS",
    "104": "28 marks - FAIL"
}

# Create TCP socket
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Bind server to IP and port
server.bind(("localhost", 12345))

# Listen for client
server.listen(1)
print("Server waiting for connection...")

while True:
    conn, addr = server.accept()
    print("Connected to:", addr)

    # Receive register number
    reg_no = conn.recv(1024).decode()

    # Find student result
    result = students.get(reg_no, "Student not found")

    # Send result to client
    conn.send(result.encode())

    conn.close()

