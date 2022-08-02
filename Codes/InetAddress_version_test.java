// ========== Inet Address Version test ==========

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Mohammad_AboHasan
 */
public class InetAddress_version_test {

    public static void main(String[] args) throws UnknownHostException {
        if(InetAddress.getByName("www.google.com").getAddress().length == 4) {
            System.out.println("The Address belong to IPv4");
        } else {
            System.out.println("The Address belong to IPv6");
        }

        // another way
        if(InetAddress.getByName("www.google.com") instanceof Inet4Address) {
            System.out.println("The Address belong to IPv4");
        } else {
            System.out.println("The Address belong to IPv6");
        }
    }

}
