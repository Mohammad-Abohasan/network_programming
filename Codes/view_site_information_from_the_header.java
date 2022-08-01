import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Mohammad_AboHasan
 */
public class view_site_information_from_the_header {

    public static void main(String[] args) throws IOException {
        URL u = new URL("http://www.microsoft.com");
        URLConnection uc = u.openConnection();
        uc.connect();
        String header;
        for (int i = 0;; i++) {
            header = uc.getHeaderField(i);
            if (header == null) {
                break;
            }
            System.out.println(uc.getHeaderFieldKey(i) + " : " + header);
        }
    }
}
