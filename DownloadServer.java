import java.io.*;
import java.net.*;

public class DownloadServer {
    public static void main(String[] args) throws IOException{
        ServerSocket s = new ServerSocket(5001);
        Socket ss = s.accept();

        FileInputStream file = new FileInputStream("example.txt");
        OutputStream out =  ss.getOutputStream();
        while (true) {
            
            byte[] buffer = new byte[4096];
            int r;
            while((r=file.read(buffer))!=-1){
                out.write(buffer, 0, r);
            }
        }
    }
}
