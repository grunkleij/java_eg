import java.net.*;
import java.io.*;

public class UDPServer {

    public static void main(String[] args) throws SocketException, IOException{
        DatagramSocket ds = new DatagramSocket(5001);
        
        byte[] buffer = new byte[2046];

        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        ds.receive(dp);

        System.out.println("Client"+ new String(dp.getData()));
        
        String msg = "Blha";
        byte[] buffer2 = msg.getBytes();

        // DatagramPacket dp2 = new DatagramPacket(buffer2, buffer2.length, )


    }    
}
