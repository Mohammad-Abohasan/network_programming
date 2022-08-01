package Network_Layer;
// ========== Extract domain name ==========

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author Mohammad_AboHasan
 */
public class InetAddress_HN_finder {

    public static void main(String[] args) throws IOException {
        System.out.println("Host Name : " + InetAddress.getByName("31.13.92.36").getHostName());

        InetAddress[] aia = InetAddress.getAllByName("www.yahoo.com");
        for (InetAddress ia : aia) {
            System.out.println("IP : " + ia + " --> Reachable : " + ia.isReachable(90));
            // [InetAddress.isReachable(int timeout)]throws IOException , The timeout value in milliseconds and positive value
        }

        System.out.println("Canonical HostName : " + InetAddress.getByName("31.13.92.36").getCanonicalHostName());
    }

}

/* Output :-
Host Name : edge-star-mini-shv-01-frt3.facebook.com
IP : www.yahoo.com/87.248.100.216 --> Reachable : true
IP : www.yahoo.com/87.248.100.215 --> Reachable : false
Canonical HostName : edge-star-mini-shv-01-frt3.facebook.com
*/
