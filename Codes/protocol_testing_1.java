/*
in application layer there are several protocols :-
  - HTTP
  - HTTPS
  - FTP
  - Telnet
  - mail to
  - nfs
  - ldap

exist two ways to check protocol [supported or not] :-
  1- take it as regular expression (sub-string).
  2- take it as string.
 */

import java.net.URL;

/**
 *
 * @author Mohammad_AboHasan
 */
public class protocol_testing_1 {

    public static void main(String[] args) {
        String host = "www.google.com";
        String file = "index.html";
        String[] reg_ex = {"http", "https", "ftp", "mailto", "telnet", "ldap", "jdbs", "file", "nfs"};
        URL url;
        for (String reg : reg_ex) {
            try {
                url = new URL(reg, host, file);
                System.out.println(reg + " : supported");
            } catch (Exception e) {
                System.out.println(reg + " : unsupported");
            }
        }
    }
}
