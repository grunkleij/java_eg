import java.io.*;

class Demo implements Serializable {
    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class Serialisation {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            Demo object = new Demo(1, "hello");

            FileOutputStream file = new FileOutputStream("blah.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            file.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream file = new FileInputStream("blah.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            Demo object1 = (Demo) in.readObject();
            System.out.println("Number: "+object1.a+" String: "+object1.b);
            file.close();
            in.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
