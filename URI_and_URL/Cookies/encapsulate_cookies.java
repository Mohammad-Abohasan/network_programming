package Cookies;

import java.net.URLConnection;

/**
 *
 * @author Mohammad_AboHasan
 */
public class encapsulate_cookies {

    private static String headerKey;
    private static String headerValue;

    public static URLConnection encapsulateCookies(URLConnection uc) {
        for (int i = 0;; i++) {
            headerKey = uc.getHeaderFieldKey(i);
            headerValue = uc.getHeaderField(i);
            if (headerKey == null && "HTTP/1.1 200 OK".equalsIgnoreCase(headerValue)) {
                continue;
            } else if (headerKey == null || headerValue == null) {
                break;
            }
            if ("Set-Cookie".equalsIgnoreCase(headerKey)) {
                String[] fields = headerValue.split(";\\s");
                for (String field : fields) {
                    if ("Secure".equalsIgnoreCase(field)) {
                        System.out.println("========== Secure = true ==========");
                        break;
                    }
                    System.out.println(field);
                }
            }
        }
        return uc;
    }
}
