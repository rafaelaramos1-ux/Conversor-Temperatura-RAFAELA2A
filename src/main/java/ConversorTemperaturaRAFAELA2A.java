
import java.util.Scanner;

public class ConversorTemperaturaRAFAELA2A {

    private static double graus;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar){
            System.out.println("---CONVERSOR DE TEMPERATURA---");
            System.out.println("1. Calcius");
            System.out.println("2. Fahrenheint");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.print("Escolha a unidade de origem: ");
            int escolha = scanner.nextInt();
            
            if (escolha == 4){
                continuar=false;
                continue;              
            }
            if(escolha<1 || escolha >4){
                System.out.println("Escolha inválida!"); 
                continue;
            }
            System.out.println("Digite o valor da temperatura: ");
            
            switch(escolha){
                case 1 :
                    Celsius celsius = new Celsius(graus);
                    System.out.println("***********************");
                    System.out.println("Resultado: ");
                    System.out.println("Fahrenheint" + celsius.paraFahrenheit());
                    System.out.println("Kelvin:"+ celsius.paraKelvin());
                    System.out.println("************************");
                    break;
                case 2 :
                    Fahrenheit fa = new Fahrenheit(graus);
                    System.out.println("**********************");
                    System.out.println("Resultado:");
                    System.out.println("Celsius"+ fa.paraCelsius());
                    System.out.println("Kelvin"+ fa.paraKelvin());
                    System.out.println("**********************");
                    break;
                case 3 :
                    Kelvin kel = new Kelvin(graus);
                    System.out.println("**********************");
                    System.out.println("Resultado:");
                    System.out.println("Celsius: "+ kel.paraCelsius());
                    System.out.println("Fahrenheit: "+ kel.paraFahrnhenit());
                    break;
            }
        }
        System.out.println("PROGRAMA ENCERRADO!");
        scanner.close();
    }
        
}
