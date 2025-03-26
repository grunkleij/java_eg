import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException{

        DatagramSocket s = new DatagramSocket();
        String msg = "Hello server";
        byte[] buffer  = msg.getBytes();

        InetAddress add = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, add, 5000);
        s.send(dp);
        s.receive(dp);
        System.out.println("Client: "+new String(dp.getData()));
    }
}
