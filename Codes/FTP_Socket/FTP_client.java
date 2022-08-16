import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author Mohammad_AboHasan
 */
public class FTP_client {

    public static void main(String[] args) throws IOException {
        Socket soc = new Socket("127.0.0.1", 4000);
        InputStream in = soc.getInputStream();
        OutputStream out = new FileOutputStream("mohammad.txt");
        byte[] b = new byte[20 * 1024];
        int i;
        while ((i = in.read(b)) > 0) {
            out.write(b, 0, i); // [i, i - 1]
        }
        in.close();
        out.close();
        soc.close();
    }

}
