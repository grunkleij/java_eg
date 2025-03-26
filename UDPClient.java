import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException{

        DatagramSocket ds = new DatagramSocket();

        String msg = "hello";
        byte[] buffer = msg.getBytes();

        InetAddress add = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, add, 5001);

        ds.send(dp);

    }
}
