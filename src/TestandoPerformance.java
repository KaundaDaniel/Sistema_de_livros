import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestandoPerformance {
    public static void main(String[] args) {
        HashSet<String> colecao = new HashSet<>();
        for(int i=0; i<100000; i++){
            colecao.add("Elemento " + i);
        }

        long tempoInicial = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            colecao.contains("Elemento " + i);
        }
        long tempoFinal = System.currentTimeMillis();
        long tempo=tempoFinal-tempoInicial;
        System.out.println("Tempo de execução: " + tempo + " ms");


    }
}
