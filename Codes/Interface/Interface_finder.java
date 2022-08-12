import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 * @author Mohammad_AboHasan
 */
public class Interface_finder {

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            System.out.println(interfaces.nextElement());
            // System.out.println(interfaces.nextElement().getDisplayName());
        }
    }

}
