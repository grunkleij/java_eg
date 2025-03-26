import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        System.out.println("Connected");

        BufferedReader input = new BufferedReader( new InputStreamReader(s.getInputStream()));
        PrintWriter output = new PrintWriter( s.getOutputStream(), true);

        String msg = input.readLine();

        System.out.println(msg);
        output.println("hello");
    }
}