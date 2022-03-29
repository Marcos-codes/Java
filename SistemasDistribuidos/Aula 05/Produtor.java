public class Produtor {
    Valores valor;

    public Produtor(Valores valor){
        this.valor = valor;

    }

    @Override
    public void run(){
        int tempo;
            for(int i=0; i < 11; i++){
                tempo = (int) (Math.random() * 3000);
                //valor.guardar(i);
                System.out.println("Consumidor Lendo o valor: \t" + valor.exbir());
                try {
                    Thread.sleep(tempo);
                } catch (InterruptedException e) {
                    
                }
            }   

    }
}
