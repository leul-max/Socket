import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client started");
            Socket soc = new Socket("localhost", 9806);

            // Reading input from the user
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a message for the server: ");
            String str = userInput.readLine();

            // Sending data to the server
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);

            // Receiving data from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println("Server response: " + in.readLine());

            // Closing resources
            in.close();
            out.close();
            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
