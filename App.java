import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        float Numero1 = 0;
        float Numero2 = 0;
        int ope = 0;
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        Numero1 = sc.nextFloat();
        System.out.println("Digite el segundo numero");
        Numero2 = sc.nextFloat();
        System.out.println("Digite el numero de la operacion a realizar: 1: suma, 2: multiplicacion, 3: division");
        ope = sc.nextInt();

        Main oper = new Main(Numero1, Numero2);
        float resul = 0;

        switch(ope) {
            case 1: resul = oper.suma(); break;
            case 2: resul = oper.multiplicacion(); break;
            case 3: resul = oper.division(); break;

        }


        
        System.out.println("El resultado de la operacion es: "+resul);

    }
}
