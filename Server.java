import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket Server = new ServerSocket(5000);
        Socket Socket = Server.accept();
        System.out.println("server started");

        String pesan = "assalamu'alaikum";
        // takes input from terminal
        // DataInputStream input = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(Socket.getOutputStream());
        out.writeUTF(pesan);

        DataInputStream input = new DataInputStream(Socket.getInputStream());
        String BacaPesan = input.readUTF();
        System.out.println(BacaPesan);

    }
}
