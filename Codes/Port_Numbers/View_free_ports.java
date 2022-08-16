/*
two types of port :-
  1- reserved port [0 - 1023]     --> Low  ports
  2- Free     port [1024 - 65535] --> High ports
*/
import java.net.ServerSocket;

/**
 *
 * @author Mohammad_AboHasan
 */
public class View_free_ports {

    public static void main(String[] args) {
        ServerSocket s;
        for (int port = 1024; port <= 65535; port++) {
            try {
                s = new ServerSocket(port);
                System.out.println("it's free port : " + port);
            } catch (Exception e) {
                // continue
            }
        }
    }

}
