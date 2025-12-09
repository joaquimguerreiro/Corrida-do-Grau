public class CorridaV1 { // Abre a classe corrida

    public static void main(String[] args) {

        CorredorV1[] corredores = { // Declara os corredores e os valores de suas variáveis, por ordem, sendo:

                // 1 ID, 2 NOME, 3 KM INICIAL, 4 SE É HOMEM, 5 SE DIRIGE MOTO

                new CorredorV1(0, "Joaquim", 0, true, false, "\u001B[34m"),
                new CorredorV1(1, "Tiago", 0, true, false, "\u001B[31m"),
                new CorredorV1(2, "Eduardo", 0, true, false, "\u001B[31m"),
                new CorredorV1(3, "Arthur", 0, true, true, "\u001B[31m"),
                new CorredorV1(4, "Vitor", 0, true, false, "\u001B[35m"),
                new CorredorV1(5, "Francisco", 0, true, false, "\u001B[35m"),
                new CorredorV1(6, "Samira", 0, false, false, "\u001B[34m"),
                new CorredorV1(7, "Bernardo", 0, true, true, "\u001B[37m"),
                new CorredorV1(8, "Jordana", 0, false, false, "\u001B[37m"),
                new CorredorV1(9, "Gabrieli", 0, false, false, "\u001B[37m"),
                new CorredorV1(10, "Poejo", 0, false, true, "\u001B[34m"),

        };

        int i; // Declaração do I para andarmos no array através do FOR
        boolean vencedorEncontrado = false; // Declaração de varíavel de verificação, para sabermos se foi encontrado um
                                            // vencedor, no caso, falso

        while (!vencedorEncontrado) { // Loop para repetir-se até encontrar um vencedor

            try {
                Thread.sleep(2000); // Pausa de 2 segundos a cada loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (i = 0; i < corredores.length; i++) { // For para andarmos no array de corredores

                corredores[i].imprimirVeiculo(); // Puxa função de Veiculo de cada Corredor

                if (corredores[i].getkm() >= 10) { // Condição que verifica, se o KM do Corredor é maior ou igual a 10

                    corredores[i].mostrarVencedor(); // Puxa função de mostrar o vencedor do Corredor que atingiu 10 ou
                                                     // mais KM
                    vencedorEncontrado = true; // Declara que agora o vencedor foi encontrado, saindo do loop
                    break; // Para o loop do for, mesmo se o I não é maior que a quantidade de corredores
                }
            }

        }

    }
}

// Feito pelo Joaquim do Grau