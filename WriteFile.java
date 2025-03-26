import java.io.*;

public class WriteFile {
    public static void main(String[] args){
        try {
            FileOutputStream f = new FileOutputStream("example.txt");
            String msg= "Hello wordl";
            byte[] bytes = msg.getBytes();
            f.write(bytes);
            f.close();


        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
