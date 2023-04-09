import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o tamanho do Arquivo em MB: ");
        double mb;
        mb = leia.nextDouble();

        System.out.println("Informe a velocidade da sua internet em MBPS: ");
        double net;
        net = leia.nextDouble();

        double tempo;
        double tempos;
        tempo = mb * 8 / net;
        tempos = tempo / 60;

        System.out.printf("Restam aproximadamente [%.2f] minutos e [%.2f] segundos.", tempo, tempos);

    }

}