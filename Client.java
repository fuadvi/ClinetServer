import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        String bacaPesan = input.readUTF();
        System.out.println(bacaPesan);

        String line = "";
        // in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        // aktifkan baris 3 di bawah ini untuk mengirim pesan lewat keyboard
        // DataInputStream a = new DataInputStream(System.in);
        // line = a.readLine();
        // out.writeUTF(line);

        String pesan = "waalaikum salam";
        out.writeUTF(pesan);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    }
}
