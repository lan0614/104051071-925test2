import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, x;
        System.out.print("請輸入x:");
        x = input.nextInt();
        a = x/10000 ;
        b = (x-a*10000)/1000 ;
        c = (x-a*10000-b*1000)/100 ;
        d = (x-a*10000-b*1000-c*100)/10 ;
        e = x-a*10000-b*1000-c*100-d*10 ;
        System.out.printf("%d %d %d %d %d ", a ,b , c , d, e);

        System.out.print("\n請輸入x:");
        x = input.nextInt();
        a = x/10000 ;
        b = (x-a*10000)/1000 ;
        c = (x-a*10000-b*1000)/100 ;
        d = (x-a*10000-b*1000-c*100)/10 ;
        e = x-a*10000-b*1000-c*100-d*10 ;
        System.out.printf("%d %d %d %d %d ", a ,b , c , d, e);

    }
}