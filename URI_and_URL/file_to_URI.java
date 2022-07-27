package URI_and_URL;

import java.io.File;
import java.net.URI;

/**
 *
 * @author Mohammad_AboHasan
 */
public class file_to_URI {

    public static void main(String[] args) throws Exception {
        File f = new File("test.txt");
        URI uri = f.toURI();
        System.out.println(f);
        System.out.println(uri);
    }
}
