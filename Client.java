import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException,  UnknownHostException{
        Socket s = new Socket("localhost",5000);

        BufferedReader in = new BufferedReader(new InputStreamReader( s.getInputStream()));
        PrintWriter out = new  PrintWriter(s.getOutputStream(), true);

        out.println("blah");
        System.out.println("server: "+in.readLine());
    }
}
