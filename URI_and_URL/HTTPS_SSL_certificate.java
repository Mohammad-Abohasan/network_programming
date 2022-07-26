import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.facebook.com");
        URLConnection uc = url.openConnection();
        HttpsURLConnection con = (HttpsURLConnection) uc;
        InputStream is = con.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader buf = new BufferedReader(isr);
        String s;
        while((s = buf.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println("Cipher Code : " + con.getCipherSuite()); // type encryption
        Certificate[] certs = con.getServerCertificates();
        System.out.println(Arrays.toString(certs));
        for (int i = 0; i < certs.length; i++) {
            System.out.println("Certificate Type                : " + certs[i].getType());
            System.out.println("Certificate HashCode            : " + certs[i].hashCode());
            System.out.println("Certificate PuplicKey           : " + certs[i].getPublicKey().getFormat());
            System.out.println("Certificate PuplicKey Algorithm : " + certs[i].getPublicKey().getAlgorithm());
        }
    }
}
