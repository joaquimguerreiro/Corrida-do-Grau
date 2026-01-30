public class CorridaV1 { // Abre a classe corrida

    public static void main(String[] args) {

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

        int posicaoGeral = 0;

        int i; // Declaração do I para andarmos no array através do FOR
        boolean todosFinalizaram = false; // Declaração de varíavel de verificação, para sabermos se foi encontrado um
                                            // vencedor, no caso, falso

        while (!todosFinalizaram) { // Loop para repetir-se até encontrar um vencedor

            try {
                Thread.sleep(2000); // Pausa de 2 segundos a cada loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (i = 0; i < corredores.length; i++) { // For para andarmos no array de corredores

                if (!todosFinalizaram && corredores[i].posicaoAlocada == false) {
                    
                corredores[i].imprimirVeiculo(); } // Puxa função de Veiculo de cada Corredor

                if (corredores[i].getkm() >= 10) {

                    corredores[i].posicao = posicaoGeral + 1;
                    corredores[i].posicaoAlocada = true;

                } 
                

                }
            }

        }

    }


// Feito pelo Joaquim do Grau