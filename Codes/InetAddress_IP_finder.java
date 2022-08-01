package Network_Layer;
// ========== Extract IP for several methods ==========
// [Inet4Address + Inet6Address] = InetAddress

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

/**
 *
 * @author Mohammad_AboHasan
 */
public class InetAddress_IP_finder {

    public static void main(String[] args) throws IOException {
        System.out.println("localhost : " + InetAddress.getLocalHost()); // [static method]
        // [three cases] := Mohammad-AboHasan/192.168.56.1 -- when connect with internet [<Device-name>/my_private_ip],
        //                  Mohammad-AboHasan/127.0.0.1    -- when offline               [<Device-name>/loopback]     ,
        //                  no-output when exists Firewall                                                            .

        System.out.println("loopback : " + InetAddress.getLoopbackAddress()); // [static method]
        // loopback : localhost/127.0.0.1

        System.out.println("Google Address : " + InetAddress.getByName("www.google.com")); // [static method]
        // return one ip address

        System.out.println("Google Address : " + Arrays.toString(InetAddress.getAllByName("www.yahoo.com"))); // [static method]
        // return all ip address
    }

}

/* Output
localhost : Mohammad-AboHasan/192.168.56.1
loopback : localhost/127.0.0.1
Google Address : www.google.com/216.58.205.196
Google Address : [www.yahoo.com/87.248.100.216, www.yahoo.com/87.248.100.215]
*/
