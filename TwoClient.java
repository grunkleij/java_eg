import java.io.*;
import java.net.*;;


public class TwoClient {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 5010);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Client: ");
            String msg = console.readLine();
            out.println(msg);
            if(msg.equals("exit"))
                break;
            System.out.println("Server: "+in.readLine());
        }
    }
}
