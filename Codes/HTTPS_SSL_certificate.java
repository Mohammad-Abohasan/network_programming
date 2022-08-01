package URI_and_URL;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;

/**
 *
 * @author Mohammad_AboHasan
 */
public class HTTPS_SSL_certificate {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.facebook.com");
        URLConnection uc = url.openConnection();
        HttpsURLConnection con = (HttpsURLConnection) uc;
        InputStream is = con.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader buf = new BufferedReader(isr);
        String s;
        while ((s = buf.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println("Cipher Code : " + con.getCipherSuite()); // type encryption
        Certificate[] certs = con.getServerCertificates();
        for (Certificate cert : certs) {
            System.out.println("Certificate Type                : " + cert.getType());
            System.out.println("Certificate HashCode            : " + cert.hashCode());
            System.out.println("Certificate PuplicKey           : " + cert.getPublicKey().getFormat());
            System.out.println("Certificate PuplicKey Algorithm : " + cert.getPublicKey().getAlgorithm());
        }
    }
}
