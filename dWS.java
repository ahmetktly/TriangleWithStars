import java.util.Scanner;
public class dWS{

    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);
        System.out.println("Üçgenin alt kenar uzunluğu kaç satır olsun :");
        int edge=inp.nextInt();
        System.out.println("Üçgeni hangi karakterle çizelim :");
        char symbol=inp.next().charAt(0);

       for (int i = 0 ; i <= edge ; i++ ){

            for (int j = 0; j < (edge - i); j++) {
                System.out.print(" ");
        }
            for (int k = 1; k <= (2 * i + 1); k++) {
             System.out.print(symbol);
        }
        System.out.println(" ");
    }
       for (int a = edge-1 ; a >= 0 ; a-- ){

            for (int s = 0; s < (edge - a); s++) {
                System.out.print(" ");
        }
            for (int d = 1; d <= (2 * a + 1); d++) {
             System.out.print(symbol);
        }
        System.out.println(" ");
    }

       }

    }
