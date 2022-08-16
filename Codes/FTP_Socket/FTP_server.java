// ========== data download ==========

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Mohammad_AboHasan
 */
public class FTP_server {

    public static void main(String[] args) throws IOException {
        ServerSocket ssc = new ServerSocket(4000);
        Socket soc = ssc.accept();
        File file = new File("mohammad.txt");
        InputStream in = new FileInputStream(file);
        OutputStream out = soc.getOutputStream();
        byte[] b = new byte[20 * 1024];
        int i;
        while ((i = in.read(b)) > 0) {
            out.write(b, 0, i); // [i, i - 1]
        }
        in.close();
        out.close();
        soc.close();
        ssc.close();
    }

}
