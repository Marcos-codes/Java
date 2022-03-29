//import javax.swing.plaf.synth.SynthScrollBarUI;

class ClasseRunnable implements java.lang.Runnable{
    private int contador;
    private final int contadorTotal;


    public ClasseRunnable(int contadorTotal){
        this.contadorTotal = contadorTotal;
        this.contador = 0;

    }

    @Override
    public void run(){
        //Estrutura de repetição 
        while(contador <= contadorTotal){
        System.out.println(Thread.currentThread().getName()
        + " Prioridade: " + Thread.currentThread().getPriority()
        + " - Contador: " + contador);
        contador++;

        // vamos colocar a thread para "nanar" (dormir) uma pausa
        try {
            System.out.println(Thread.currentThread().getName() + " dormindo");
            Thread.sleep(2000);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace(System.err);
        }
        }

        System.out.println("\nThread " + Thread.currentThread().getName()
        + "finalizada com sucesso!!!");
    }
}

public class MyRunnable{
    public static void main(String[] args) {
    //Criação dos metodos 
    // Parametro do metodo e o contado
    ClasseRunnable r1 = new ClasseRunnable(30);
    ClasseRunnable r2 = new ClasseRunnable(40);
    ClasseRunnable r3 = new ClasseRunnable(50);

    //Criar os threads (Min, Normal e MAX - PRIORITY)
    Thread t1 = new Thread(r1);  
    t1.setName("R1 - ");
    t1.setPriority(Thread.MIN_PRIORITY);
    t1.start();  

    Thread t2 = new Thread(r2);  
    t2.setName("R2 - ");
    t2.setPriority(Thread.MIN_PRIORITY);
    t2.start();  

    Thread t3 = new Thread(r3);  
    t3.setName("R3 - ");
    t3.setPriority(Thread.MIN_PRIORITY);
    t3.start();  
    System.out.println("Threads iniciadas com sucesso!");
    }

}
