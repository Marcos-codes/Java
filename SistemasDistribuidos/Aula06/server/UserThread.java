import java.io.*;// Requisições de entrada/saida
import java.net.*;// conexões de rede (sockests)



public class UserThread extends Thread {
    private final Socket socket; //meio de comunicação (TCP)
    private final ChatServer server;//o servidor de chat
    private PrintWriter writer; //Escrever no buffer de saida(I/O) 

    public UserThread(Socket socket ChatServer server){
        this.socket = socket;
        this.server = server;

    }
}
