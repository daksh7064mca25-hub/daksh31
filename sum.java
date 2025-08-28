import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        System.out.println("Enter a number. ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Second Numeber. ");
        int b = sc.nextInt();
        int c;
        c = a + b;

        System.out.println(c);
        sc.close();

    }
}