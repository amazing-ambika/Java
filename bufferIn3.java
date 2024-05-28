import java.io.*;
// way2 of using BufferedReader without having to wite java.io everywhere and without having to import java.io package
public class bufferIn3 {
    public static void main(String[] args) {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name;
        try{
            name = a.readLine();
        } catch (IOException ex) {
        }
        System.out.println("Your name is: "+ name );    
    }
}
