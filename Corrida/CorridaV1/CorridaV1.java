import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CorridaV1 { // Abre a classe corrida

    public static char[] resultado;

    public static void main(String[] args) throws IOException {

        CorredorV1[] corredores = { // Declara os corredores e os valores de suas variáveis, por ordem, sendo:

                // 1 ID, 2 NOME, 3 KM INICIAL, 4 SE É HOMEM, 5 SE DIRIGE MOTO

                new CorredorV1(0, "Joaquim", 0, true, false, "\u001B[34m", false, 0),
                new CorredorV1(1, "Tiago", 0, true, false, "\u001B[31m", false, 0),
                new CorredorV1(2, "Eduardo", 0, true, false, "\u001B[31m", false, 0),
                new CorredorV1(3, "Arthur", 0, true, true, "\u001B[31m", false, 0),
                new CorredorV1(4, "Vitor", 0, true, false, "\u001B[35m", false, 0),
                new CorredorV1(5, "Francisco", 0, true, false, "\u001B[35m", false, 0),
                new CorredorV1(6, "Samira", 0, false, false, "\u001B[34m", false, 0),
                new CorredorV1(7, "Bernardo", 0, true, true, "\u001B[37m", false, 0),
                new CorredorV1(8, "Jordana", 0, false, false, "\u001B[37m", false, 0),
                new CorredorV1(9, "Gabrieli", 0, false, false, "\u001B[37m", false, 0),
                new CorredorV1(10, "Poejo", 0, false, true, "\u001B[34m", false, 0),

        };

        int i; // Declaração do I para andarmos no array através do FOR
        boolean corridaEmAndamento = true; // corrida em andamento inicio da logica
        int posicaoGeral = 0;

        while (corridaEmAndamento == true) { // enquanto a corrida estiver em andamento

            try {
                Thread.sleep(500); // Pausa de 2 segundos a cada loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            corridaEmAndamento = false;

            for (i = 0; i < corredores.length; i++) { // For para andarmos no array de corredores

                if (corredores[i].finalizou == false) {

                    corredores[i].imprimirVeiculo();
                } // Puxa função de Veiculo de cada Corredor

                if (corredores[i].finalizou == false && corredores[i].getkm() >= 10) {

                    corredores[i].posicao = posicaoGeral + 1;
                    posicaoGeral = corredores[i].posicao;
                }

                if (corredores[i].getkm() >= 10) {

                    corredores[i].finalizou = true;

                } else {

                    corridaEmAndamento = true;
                }

            }

        }

        String resultado = "";

        for (i = 0; i < corredores.length; i++) {

            resultado += ("\n" + corredores[i].nome + " finalizou na posição: " + corredores[i].posicao);
        }

        System.out.println(resultado);

        File log = new File("C:\\Users\\joaqu\\Documents\\GitHub\\Corrida-do-Grau\\Corrida\\CorridaV1\\logs\\log.txt");

        FileWriter fw = new FileWriter(log);

        fw.write(resultado);

        fw.close();

    }

}

// Feito pelo Joaquim do Grau