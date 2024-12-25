import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept(); // Accepting client connection
            System.out.println("Connection established");

            // Reading data from the client
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String clientMessage = in.readLine();
            System.out.println("Client says: " + clientMessage);

            // Sending response to the client
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server says: Message received -> " + clientMessage);

            // Closing resources
            in.close();
            out.close();
            soc.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
