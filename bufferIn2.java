// way1 of using BufferedReader by importing java.io package
public class bufferIn2 {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader a = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = a.readLine();
        System.out.println("Your name is: "+ name );
    
    }
}
