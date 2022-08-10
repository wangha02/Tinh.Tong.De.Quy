import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap So " );
        int input = scanner.nextInt();
        say(input);
    }

    public static void say(int i ) {

        if (i == 0 ){
            return;

        }else {
            System.out.println("Hello ");
            i--;
            say(i);
        }
    }
}