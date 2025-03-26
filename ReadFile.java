import java.io.*;

class ReadFile {
    public static void main(String[] args) {
        FileInputStream f;
        try {
            f = new FileInputStream("example.txt");

            int c;
            do {
                c = f.read();
                System.out.print((char)c);
            } while (c != -1);
            f.close();
        } catch (IOException e) {
            // TODO: handle exception
        } 
           
        
    }
}