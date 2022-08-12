import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.net.Socket;

/**
 *
 * @author Mohammad_AboHasan
 */
public class Socket_reader {

    public static void main(String[] args) throws IOException {
        String host = "www.yahoo.com";
        Socket sc = new Socket(host, 80);
        OutputStream os = sc.getOutputStream();
        PrintWriter out = new PrintWriter(os, true); // autoFlush = true
        out.println("host:" + host + "80");
        InputStream is = sc.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder(8 * 1024); // capacity = 8K
        int i = 0;
        while ((i = br.read()) != -1) {
            sb.append((char) i);
        }
        System.out.println(sb);
        os.close();
        sc.close();
    }

}
