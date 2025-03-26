import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args) throws IOException{
      ServerSocket ss = new ServerSocket(5001);
      Socket s = ss.accept();
      System.out.println("Connected");

      BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
      PrintWriter out = new PrintWriter(s.getOutputStream(), true);

      String msg = in.readLine();
      System.out.println("Client: "+msg);
      out.println("Hello");
      ss.close();
      s.close();
    }
}