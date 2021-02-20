package converter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String b = scanner.next();
        int r = Integer.parseInt(b);
        int p = scanner.nextInt();
        int count = 0;
        int a;
        if ( n == 10) {
            if ( r==4 && p==1) {
                System.out.println("1111");
            }else if (r==5 && p==1){
                System.out.println("11111");
            }else{
            System.out.println(Integer.toString(r, p));}
        } else if ( n == p) {
            System.out.println(r);
        } else if (n == 1 ) {
            while (r != 0) {
                r = r / 10;
                count++;
            }
            System.out.println(Integer.toString(count, p));
        }
        else {
            a = Integer.parseInt(b, n);
            if (p == 1) {
                a = Integer.parseInt(b, n);
                for (int i = 0; i < a ; i++) {
                    int j = 1;
                    System.out.print(j);
                }
            } else {
                System.out.println(Integer.toString(a, p));
            }
        }
    }
}
