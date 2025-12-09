import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Variant;

// Declaração do objeto CORREDOR

public class CorredorV1 {

    ActiveXComponent sapi = new ActiveXComponent("SAPI.SpVoice");

    // Declaração das variáveis que compõem o objeto CORREDOR

    int id; // ID do corredor
    String nome; // Nome do corredor
    int km; // km inicial do corredor
    boolean isHomem; // Variável verificadora se é homem SEXO falso mulher
    boolean isMoto; // Variável verificadora se anda de moto VEICULO falso carro
    String cor; // Cor do corredor
    String reset = "\u001B[0m";

    public CorredorV1(int id, String nome, int km, boolean isHomem, boolean isMoto, String cor) { // função construtora do
                                                                                                // objeto
        // corredor, que será puxado no main
        // (corrida)

        this.id = id; // vincula id de entrada com id do corredor
        this.nome = nome; // vincula nome de entrada com nome do corredor
        this.km = km; // vincula km de entrada com km do corredor
        this.isHomem = isHomem; // vincula sexo de entrada com sexo do corredor
        this.isMoto = isMoto; // vincula veiculo de entrada com veiculo do corredor
        this.cor = cor; // cor de entrada com cor do corredor

    }

    public void imprimirVeiculo() { // Função que permite imprimir o carro e andar as direções

        km += (int) (Math.random() * 3); // Acúmulo de KMs andados na variável KM do Corredor, com aleatoriedade
                                         // convertida em * 3
        System.out.println("" + nome + " está no " + km + "KM"); // Imprime o nome do Corredor e o KM em que ele está
        String espaco = "     "; // Espaço para realizar o andamento dos veiculos
        String espacoPorKm = espaco.repeat(km); // Pega a variavel Espaco e acumula ela com os KMs andados do Corredor
        String linhaDeChegada = espaco.repeat(10) + "| CHEGADA"; // Permite controlar corretamente onde deve ser a linha
                                                                 // de chegada conforme os espaços para andar

        if (isMoto) { // Condição que verifica se o Corredor dirige Moto, se sim, imprime a sua moto
                      // (espacoPorKM para andar conforme seu KM e seu desenho ao lado)
            System.out.println(espacoPorKm + cor +  "    o_," + reset);
            System.out.println(espacoPorKm + cor +  "::,\\-c\\-." + reset); // Moto do Grau
            System.out.println(espacoPorKm + cor +  "(_)=='(_)" + reset);
            System.out.println(linhaDeChegada); // Impressão da linha de chegada

        } else { // Se a condição do corredor dirigir moto ser falsa, irá imprimir o seu carro
                 // (espacoPorKM para andar conforme seu KM e seu desenho ao lado)
            System.out.println(espacoPorKm + cor +  "  ______" + reset);
            System.out.println(espacoPorKm + cor +  " /|_||_\\`.__" + reset);
            System.out.println(espacoPorKm + cor +  "(   _    _ _\\" + reset); // Carro do Grau
            System.out.println(espacoPorKm + cor +  "=`-(_)--(_)-'" + reset);
            System.out.println(linhaDeChegada); // Impressão da linha de chegada
        }
    }

    public int getkm() { // Função simples que busca o KM do Corredor

        return km;
    }

    public void mostrarVencedor() { // Função para imprimir o vencedor, com estrutura de if/else, que, se for homem,
                                    // irá imprimir no masculino, senão, no feminino

        if (isHomem) {

            System.out.println("" + nome + " é o vencedor!");
            sapi.invoke("Speak", new Variant("" + nome + " é o vencedor!"));

        } else {

            System.out.println("" + nome + " é a vencedora!");
            sapi.invoke("Speak", new Variant("" + nome + " é a vencedora!"));

        }
    }

}

// Feito pelo Joaquim do Grau