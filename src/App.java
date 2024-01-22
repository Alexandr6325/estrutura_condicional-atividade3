import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N1;
        int N2;

        System.out.println("Digite dois numeros");
        N1 = sc.nextInt();
        N2 = sc.nextInt();

        if (N1 % N2 == 0 || N2 % N1 == 0){
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SAO MULTIPLOS");
        }
        
        sc.close();
    }
}
