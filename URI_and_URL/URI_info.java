package URI_and_URL;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Mohammad_AboHasan
 */
public class URI_test {
    
    public static void main(String[] args) throws URISyntaxException {
        URI uri = new URI("http://www.facebook.com:8080/c?EmpData=14#column=64");
        System.out.println(uri.getScheme());
        System.out.println(uri.getAuthority());
        System.out.println(uri.getPath());
        System.out.println(uri.getQuery());
        System.out.println(uri.getFragment());
        System.out.println(uri.getPort());
        System.out.println(uri.getUserInfo());
        
        /* 
          Q1) Why do we learn these things?
            This information is useful to :-
              1. Network Engineer.  2. Web Developer.  3. Ethical Hacker.
          Q2) What will we gain from these codes?
            benefit to :-
              1. Mining     -> The number of users who entered the site.
              2. Management -> To know how many processes and memory we need.
        */
    }
}
