package Cookies;
// Set-Cookie  sb=56_hYueTtLkYbPxXOHZrhYIX; expires=Fri, 26-Jul-2024 21:36:39 GMT; Max-Age=63072000; path=/; domain=.facebook.com; secure; httponly

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Mohammad_AboHasan
 */
public class get_cookies_from_http_server {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.facebook.com");
        URLConnection uc = url.openConnection();
        String headerKey, headerValue;
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
    }
}
