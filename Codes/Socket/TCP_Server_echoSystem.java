// https://www.geeksforgeeks.org/differences-between-tcp-and-udp/

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Mohammad_AboHasan
 */
public class TCP_Server_echoSystem {
    private static ServerSocket serSoc;
    private static final int port = 1234;

    public static void main(String[] args) {
        System.out.println("connecting to port ...");
        System.out.println("Server started ...");
        System.out.println("waiting for Client ...");

        // ========== begin step 1 ==========
        try {
            serSoc = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("unable to connect port");
            System.exit(1);
        }

        while (true) {
            handleClient();
        }

    }

    private static void handleClient() {
        // ========== begin step 2 ==========
        Socket link = null;
        try {
            link = serSoc.accept();
            System.out.println("=== Client accepted ===");
            // ========== begin step 3 ==========
            InputStream input = link.getInputStream();
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter output = new PrintWriter(link.getOutputStream(), true);
            String message;
            int numMessage = 0;
            do {
                // ========== begin step 4 ==========
                message = br.readLine();
                numMessage++;
                System.out.println("=== Message received ===");
                System.out.println("Message " + numMessage + " : " + message);
                output.println(message);
            } while (!message.equalsIgnoreCase("close"));
            System.out.println(numMessage + " Message received");
            // ========== begin step 5 ==========
            br.close();
            output.close();
        } catch (IOException e) {
            System.out.println("Message not received");
            System.exit(1);
        }
        // ========== begin step 6 ==========
        try {
            System.out.println("close connection ...");
            link.close();
        } catch (IOException e) {
            System.out.println("unable to close Socket");
            System.exit(1);
        }
    }

}