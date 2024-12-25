
# Java Socket Client-Server Echo Chat Application 🌐💬

Welcome to the Java Socket Client-Server Echo Chat Application! This project implements a simple chat application where clients can send messages to a server, which then echoes the messages back to the clients. It's a great way to learn about socket programming in Java. 🚀

## Table of Contents 📖

- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)

## Features ✨

- **Client-Server Architecture**: Demonstrates the use of sockets to create a client-server communication model.
- **Echo Functionality**: The server echoes back any message sent by the client.
- **Multi-threaded Server**: Supports multiple clients simultaneously.
- **Simple and Clear Code**: Easy to read and understand for beginners.

## Getting Started 🚀

Follow these instructions to set up the project on your local machine.

### Prerequisites 📋

Ensure you have the following installed:

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/javase-downloads.html)

### Installation 🔧

1. **Clone the repository**:
   ```bash
   git clone https://github.com/leul-max/Socket.git
   cd socket
   ```

2. **Compile the server and client**:
   ```bash
   javac Server.java
   javac Client.java
   ```

3. **Run the server**:
   ```bash
   java Server
   ```

4. **Run the client**:
   ```bash
   java Client
   ```

## Usage 📚

1. **Start the server**:
   - Run the `Server` class. The server will start and listen for incoming client connections on a specified port.

2. **Connect clients**:
   - Run the `Client` class from multiple terminals or machines. Each client will connect to the server and can start sending messages.

3. **Chat away!**:
   - Type messages in the client terminal and watch them get echoed back by the server.

### Example 🎉

```bash
Client started
Enter a message for the server: hello
Server response: Server says: Message received -> hello
```

---

Happy coding! 😃👩‍💻👨‍💻
```
