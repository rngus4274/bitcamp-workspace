import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        int lang = 1;
        if (lang == 1)
            System.out.println("Hello world!");
        else
            System.out.println("안녕하세요!");

        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        System.out.println(sc.next());
        sc.close();
    }
}