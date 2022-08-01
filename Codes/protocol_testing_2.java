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
public class protocol_testing_2 {

    public static void main(String[] args) {
        Tester("http://www.google.com.index.html");
        Tester("ftp://www.google.com.index.html");
        Tester("telnet://www.google.com.index.html");
    }

    public static void Tester(String s) {
        URL url;
        try {
            url = new URL(s);
            System.out.println(url.getProtocol() + " : is supported");
        } catch (Exception e) {
            System.out.println(s.substring(0, s.indexOf(':')) + " : is unsupported");
        }
    }
}
