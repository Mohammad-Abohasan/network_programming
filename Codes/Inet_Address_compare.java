// ========== Inet Address Compare ==========

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Mohammad_AboHasan
 */
public class Inet_Address_compare {

    public static void main(String[] args) throws UnknownHostException {
        if(InetAddress.getByName("www.google.ps").getHostAddress().equals(InetAddress.getByName("www.google.jo").getHostAddress())) {
            System.out.println("it's the same");
        } else {
            System.out.println("it's not same");
        }
        // ps == jo ? no, output : it's not same

//        if(InetAddress.getByName("www.google.jo").getHostAddress().equals(InetAddress.getByName("www.google.jo").getHostAddress())) {
//            System.out.println("it's the same");
//        } else {
//            System.out.println("it's not same");
//        } 
//        // jo == jo ? yes, output : it's the same
    }

}
