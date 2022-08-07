import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;
//import java.util.Arrays;

/**
 *
 * @author Mohammad_AboHasan
 */
public class Interface_information {

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
        NetworkInterface ni;
        List<InterfaceAddress> list;
        while (en.hasMoreElements()) {
            ni = en.nextElement();
            System.out.println("Display Name : " + ni.getDisplayName());
            System.out.println("Name         : " + ni.getName());
            System.out.println("Loopback     : " + ni.isLoopback());
            System.out.println("Activity     : " + ni.isUp());
            System.out.println("Multicast    : " + ni.supportsMulticast());
            System.out.println("PointToPoint : " + ni.isPointToPoint());
            System.out.println("Virtual      : " + ni.isVirtual());
            System.out.println("MTU          : " + ni.getMTU());
            System.out.println("HW Address   : " + ni.getHardwareAddress());
//            System.out.println("HW Address   : " + Arrays.toString(ni.getHardwareAddress()));

            list = ni.getInterfaceAddresses();
            for (InterfaceAddress ia : list) {
                System.out.println("IP Address        : " + ia.getAddress());
                System.out.println("Network Prefix    : " + ia.getNetworkPrefixLength());
                System.out.println("Broadcast Address : " + ia.getBroadcast());
            }
            System.out.println();
        }
    }

}
