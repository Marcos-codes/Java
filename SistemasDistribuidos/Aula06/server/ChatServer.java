import java.io.*;// Requisições de entrada/saida
import java.net.*;// conexões de rede (sockests)
import java.util.*;// fins gerais


public class ChatServer{
    // Porta que ficará disponivel para o serviço 

    private final int port;
    
    // Lista dos usuarios conectados(Objetos Thread)

    //private final Set<String> userNames = new HashSet<>();

    // Lista dos Threads (Objetos Threads)

    private final Set<UserThread> userThreads = new HashSet<>();

    //contrutor

    public ChatServer(int port){
        this.port = port;

    }

    // método para executar o serviço (servidor)
    // modo listening (escuta)

    public void execute(){

        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server executing in port:" + port);
            System.out.println("CTRL+C to finish");
            
            // Executando o serviço 
            while(true){
                Socket socket = serverSocket.accept();

                // Pegar o IP do Cliente
                InetAddress ip = socket.getInetAddress();
                System.out.println("New User Connect: [" + ip +"]");

                // Criar o thread dos usuarios

            }
        }catch (IOException ioex){
            System.out.println("Server erro" + ioex.getMessage());


        }

    }   

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("");
            System.out.println(" To Execute, type");
            System.out.println("java ChatServer <port>");
            System.out.println(" Eg. java ChatServer 9000");
            System.out.println("");
            System.exit(0);// Sai do programa sem gerar erro
        }

        //1. O valor digitado e um numero ?
        //2. Esta dentro de um intervalo ?(9001 até 9099)

        // http: 80
        // https: 443
        // ftp: 21
        //telnet: 23
        //ssh: 22
        //mysql: 3306
        // sqlS: 1433
        //Oracle: 1521
        // Vamos pegar o valor (a porta) e executa o serviço
        int port = Integer.parseInt(args[0]);//converte string para inteiro 
        // instancia o servidor de chat
        ChatServer server = new ChatServer(port);
        server.execute();
    }
}