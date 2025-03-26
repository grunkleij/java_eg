import java.net.*;
import java.io.*;

public class UDPServer {

    public static void main(String[] args) throws SocketException, IOException{
        DatagramSocket s = new DatagramSocket(5000);
        byte [] buffer = new byte[2024];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        while(true){
            s.receive(dp);
            System.out.println("Recieved: "+new String(dp.getData()));
            s.send(dp);
        }


    }    
}
