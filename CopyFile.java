import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream in = new FileInputStream("example.txt");
        FileOutputStream out = new FileOutputStream("out.txt");
        int c;
        do{
            c=in.read();
            out.write(c);
            
        }while(c!=-1);
        in.close();
        out.close();
    }
}
