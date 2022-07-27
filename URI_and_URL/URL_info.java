package URI_and_URL;

import java.sql.Date;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.IOException;

/**
 *
 * @author Mohammad_AboHasan
 */
public class URL_info {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://opensource.com/");
        URLConnection c = url.openConnection();

        System.out.println(c.getContentType());
        System.out.println(c.getContentEncoding());
        System.out.println(c.getContentLength());
        System.out.println(new Date(c.getDate()));
        System.out.println(new Date(c.getLastModified()));
        System.out.println(new Date(c.getExpiration()));

        HttpURLConnection h = (HttpURLConnection) c; // HttpURLConnection extends URLConnection
        System.out.println(h.getRequestMethod());
        System.out.println(h.getResponseMessage());
        System.out.println(h.getResponseCode());
        System.out.println(h.getReadTimeout());
    }
}
