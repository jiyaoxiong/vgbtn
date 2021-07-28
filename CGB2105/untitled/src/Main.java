import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("jwctsp.kmust.edu.cn",80);
        System.out.println(socket.isClosed());
        OutputStream out = socket.getOutputStream();
        BufferedWriter outbuffer = new BufferedWriter(new OutputStreamWriter(out));
        outbuffer.write("GET " + "/" + " HTTP/1.1\r\n");
        outbuffer.write("Host: " + "www.baidu.com" + "\r\n");
        outbuffer.write("\r\n");
        outbuffer.flush();
        byte[] data = new byte[100000];
        socket.getInputStream().read(data);
        System.out.println(new String(data,"utf-8"));
        
    }
}
