package URI_and_URL;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Mohammad_AboHasan
 */
public class buffered_input_stream {

    public static void main(String[] args) throws IOException {
        URL u = new URL("http://ptuk.edu.ps/");
        URLConnection uc = u.openConnection(); // open connection
        InputStream is = uc.getInputStream(); // open stream to transfer data
        BufferedInputStream buf = new BufferedInputStream(is);
        int i = 0;
        // read() : return int (convert char to int (ascii-code))
        while ((i = buf.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
