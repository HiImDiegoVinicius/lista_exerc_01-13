import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        System.out.println("informe seu gênero: \nf Feminino\nm Masculino ");
        char genero = input.next().charAt(0);
        double pesoideal;
         if (genero == 'f') {
            pesoideal = (62.1 * altura) - 44.7;
         }
         else {
           pesoideal = (72.7 * altura) - 58;
         }
         
        System.out.println("Seu Peso Ideal É: " + pesoideal);
        
        
    }
}
