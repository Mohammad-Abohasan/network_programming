// ========== MAC Finder ==========

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 *
 * @author Mohammad_AboHasan
 */
public class Main /* MAC_finder */{

    public static void main(String[] args) throws IOException {
        InetAddress addr = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(addr);
        byte [] mac = ni.getHardwareAddress();
        for (int i = 0; i < mac.length; i++) {
            System.out.print(i == 0 ? "" : "-");
            System.out.format("%02X", mac[i]);
        }
    }

}
