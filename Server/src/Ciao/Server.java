package Ciao;
import java.net.*;
import java.io.*;
import java.util.concurrent.*;

public class Server {

    private final static int PORT=3000;
    private ServerSocket sc;
    Login prova = new Login();


    public void Connetti() throws IOException{
        ExecutorService executor = Executors.newCachedThreadPool();
        sc = new ServerSocket(PORT);
        System.out.println("Server socket ready on port: " + PORT);
        while(true) {
            Socket socket = sc.accept();
            System.out.println("Received client connection");
            executor.submit(new EchoServerClientHandler(socket, prova));

        }
    }

    public static void main(String[] args){
        Server server = new Server();
        try {
            server.Connetti();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
