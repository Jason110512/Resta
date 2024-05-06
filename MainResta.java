
    import java.util.Scanner;
public class MainResta 
{

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
        int a,b,c;
      
                System.out.println("1:ingresa un numero ");
                b=op.nextInt();
                System.out.println("ingresa otro numero");
                a=op.nextInt();

             Resta re =new Resta();
                re.setUno(a);
                re.setDos(b);

               System.out.println( re.mostrarResultado());

    }
}
