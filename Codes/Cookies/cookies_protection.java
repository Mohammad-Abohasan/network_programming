package Cookies;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Mohammad_AboHasan
 */
public class cookies_protection {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://github.com");
        URLConnection uc = url.openConnection();
        encapsulate_cookies.encapsulateCookies(uc);
    }
}
