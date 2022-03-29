public class Assincrona {
    public static void main(String[] args) {
        Valores valor = new Valores();
        System.out.println("Iniciando os Threads");

        // criação dos threads
        new Thread(new Produtor(valor)).start();
        new Thread(new Consumidor(valor)).start();
    }
}