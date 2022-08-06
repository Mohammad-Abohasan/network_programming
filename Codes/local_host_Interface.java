import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 *
 * @author Mohammad_AboHasan
 */
public class local_host_Interface {

    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(addr);
        System.out.println("Local Host : " + addr);
        System.out.println("Interface name : " + ni.getName());
        System.out.println("Display name : " + ni.getDisplayName());
    }

}
