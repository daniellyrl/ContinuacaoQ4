import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para o cadastro de aluno. \n" +
                "Digite 2 para o cadastro de professor.");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                Aluno a1 = new Aluno();
                System.out.println("Digite o seu nome: ");
                a1.setNome(sc.next());
                System.out.println("Informe o seu endereço: ");
                a1.setEndereço(sc.next());
                System.out.println("Digite sua primeira nota: ");
                a1.setNota1(sc.nextDouble());
                System.out.println("Digite sua segunda nota: ");
                a1.setNota2(sc.nextDouble());
                a1.calculamedia();
                System.out.println("Sua média é: " + a1.getMedia());

                if (a1.getMedia() >= 7){
                    System.out.println("Parabéns! \n" +
                            "Você foi aprovado.");
                } else if (a1.getMedia() >= 4 && a1.getMedia() <= 7) {
                    System.out.println("Você está na final.");
                }else{
                    System.out.println("Você foi reprovado");
                }
                break;
            case 2:
                Professor p1 = new Professor();
                System.out.println("Digite o seu nome: ");
                p1.setNome(sc.next());
                System.out.println("Informe o seu endereço: ");
                p1.setEndereço(sc.next());
                System.out.println("Qual foi a quantidade de horas que você trabalhou no mês?");
                p1.setHorasTrabalhadas(sc.nextInt());
                System.out.println("Informe o valor da hora aula: ");
                p1.setValorHoraAula(sc.nextInt());
                p1.calculasalario();
                System.out.println("O sálario que você receberá neste mês: " + p1.getSalario());
                break;
        }
    }
}