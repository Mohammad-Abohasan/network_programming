package URI_and_URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Mohammad_AboHasan
 */
public class buffered_reader {

    public static void main(String[] args) throws IOException {
        URL u = new URL("http://ptuk.edu.ps/");
        URLConnection uc = u.openConnection();
        InputStream is = uc.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
