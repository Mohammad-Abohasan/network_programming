import java.net.URI;
import java.net.URL;

/**
 *
 * @author Mohammad_AboHasan
 */
public class URI_to_URL {

    public static void main(String[] args) throws Exception {
        URI uri = new URI("http://www.youtube.com");
        URL url = uri.toURL();
        System.out.println("original  URI: " + uri);
        System.out.println("converted URL: " + url);
    }
}
