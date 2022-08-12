import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Mohammad_AboHasan
 */
public class InetAddress_version_test {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("www.google.com");
        if (ia.getAddress().length == 4) {
            System.out.println("The Address belong to IPv4");
        } else if (ia.getAddress().length == 16) {
            System.out.println("The Address belong to IPv6");
        }

        // another way
        if (ia instanceof Inet4Address) {
            System.out.println("The Address belong to IPv4");
        } else if (ia instanceof Inet6Address) {
            System.out.println("The Address belong to IPv6");
        }
    }

}
