import java.net.*;
import java.io.*;

public class TwoServer {
    public static void main(String[] args) throws IOException{

        ServerSocket ss = new ServerSocket(5010);

        Socket s = ss.accept();

        BufferedReader in  = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader console  = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while((line=in.readLine())!=null){
            System.out.println("Client: "+line);
            System.out.println("Server: ");
            String res = console.readLine();
            out.println(res);
            if(line.equals("exit"))
            break;

        }

    }


}
