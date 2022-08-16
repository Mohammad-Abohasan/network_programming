/*
two types of port :-
  1- reserved port [0 - 1023]     --> Low  ports
  2- Free     port [1024 - 65535] --> High ports
*/
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Mohammad_AboHasan
 */
public class View_TCP_port {

    public static void main(String[] args) {
        String host = "localhost";
        Socket s;
        for (int port = 0; port <= 1023; port++) {
            try {
                s = new Socket(host, port);
                System.out.print(port + ", ");
            } catch (UnknownHostException e) {
                // continue
            } catch (IOException e) {
                // continue
            }
        }
        System.out.println();
    }

}
