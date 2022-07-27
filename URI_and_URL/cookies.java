/*
Cookies := saving some data format about user.
           user and server must state.
why we used Cookies :-
  - Authorization, Authentication.
  - Shopping Carts.
  - Recommendation.
Cookies steps :-
  - user   to server --> send HTTP request.
  - server to user   --> send HTTP response + set cookies.
  - user   to server --> send HTTP request  + cookies.
  - server to user   --> send HTTP response.
*/
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.researchgate.net");
        URLConnection con = url.openConnection();
        con.setRequestProperty("Cookies", "name=Mohammad;password=4161");
        con.connect();
    }
}
