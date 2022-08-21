import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author Mohammad_AboHasan
 */
public class Main /* TCP_Client_echoSystem */ {
    private static InetAddress host;
    private static final int PORT = 1234;
    private static Socket link = null;

    public static void main(String[] args) {
        try {
            host = InetAddress.getLocalHost();
            accessServer();
        } catch (IOException e) {
            System.out.println("Host not found");
            System.exit(1);
        }
    }

    private static void accessServer() {
        System.out.println("Connected ...");
        try {
            link = new Socket(host, PORT);
            Scanner userEntry = new Scanner(System.in);
            InputStream input = link.getInputStream();
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter output = new PrintWriter(link.getOutputStream());
            String message, response;
            do {
                System.out.println("Enter your Message");
                message = userEntry.nextLine();
                System.out.println(message);
                output.println(message);
                output.flush();
                response = br.readLine();
                System.out.println("\n Server received " + response);
            } while (!message.equalsIgnoreCase("close"));
            userEntry.close();
            br.close();
            output.close();
        } catch (IOException e) {
            System.out.println("no response sent to user");
            System.exit(1);
        }
        try {
            System.out.println("Close Connection ...");
            link.close();
        } catch (IOException e) {
            System.out.println("unable to close");
            System.exit(1);
        }
    }
}
