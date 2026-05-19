//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("BEM VINDO A LISTA DE EXERCÍCIOS");

        System.out.println(" ");
        System.out.println("Par ou Ímpar");
        int numero = 11;
        if (numero % 2 == 0){
            System.out.println("o número " + numero + " é Par!");
        }
        else{
            System.out.println("o número " + numero + " é Ímpar!");
        }

        System.out.println(" ");
        System.out.println("Maioridade");

        int idade_sujeito = 17;
        if(idade_sujeito >= 18){
            System.out.println("idade: " + idade_sujeito + "essa pessoa é maior de idade!");
        } else{
            System.out.println("idade: " + idade_sujeito + "essa pessoa é menor de idade!");
        }


        System.out.println(" ");
        System.out.println("Nota de aprovação");
        double nota = 4.0;

        if (nota >= 7){
            System.out.println("O aluno(a) foi aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("O aluno(a) está em Recuperação");
        }else{
            System.out.println("O aluno(a) foi reprovado");
        }


        System.out.println(" ");
        System.out.println("Comparação de 2 números");
        int num1 = 10;
        int num2 = 10;

        if (num1 < num2){
            System.out.println(num1 + " é menor que " + num2);
        } else if(num1 > num2){
            System.out.println(num2 + " é menor que " + num1);
        } else{
            System.out.println("os números são iguais!");
        }


        System.out.println(" ");
        System.out.println("Desconto de procuto");
        double preco = 220;
        double precodescontado = preco - (preco/10);
        if(preco > 100){
            System.out.println("O valor total da compra ficou: " + precodescontado);
        } else{
            System.out.println("O valor total da compra ficou: " + preco);
        }


        System.out.println(" ");
        System.out.println("Positivo ou Negativo");
        int nume = -8;
        if (nume == 0){
            System.out.println("o número é 0");
        } else if (nume < 0){
            System.out.println("o número é negativo!");
        } else {
            System.out.println("o número é positivo!");
        }

    }
}