import java.net.*;
import java.io.*;

public class DownloadClient {
    public static void main(String[] args) throws UnknownHostException, IOException{
        Socket s = new Socket("localhost",5001);

        FileOutputStream file = new FileOutputStream("download2.txt");
        InputStream in = s.getInputStream();
        byte[] buffer = new byte[4096];
        int r;
        while((r=in.read(buffer))!=-1){
            file.write(buffer,0,r);
        }
    }
}
