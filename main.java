import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int  conta = 0;
        while (true) {
            System.out.print("Qual a sua idade?");
            int idade = scanner.nextInt();
            if(idade>=18) {
                cont += 1;
            } else {
                conta += 1;
            }
            System.out.println("Pessoas Maiores de idade:" + cont);
            System.out.println("Pessoas Menores de idade:" + conta);
            System.out.println("----------------------");
                

            
        }
    }
}
