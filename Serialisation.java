import java.io.*;

class Demo implements Serializable{
    public int a;
    public String b;

    public Demo(int a, String b){
        this.a = a;
        this.b  = b;
    }
}

public class Serialisation {
    public static void main(String[] args){
        try {
            
            Demo obj = new Demo(1,"hello");
            FileOutputStream file = new FileOutputStream("file.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream file = new FileInputStream("file.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            Demo blah  = (Demo)in.readObject();
            System.out.println("no "+blah.a);
            System.out.println("name "+blah.b);
            file.close();
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch( ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
