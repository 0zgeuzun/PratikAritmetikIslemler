import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin (a): ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayıyı girin (b): ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin (c): ");
        int c = scanner.nextInt();

        int sonuc = a + b * c - b;

        System.out.println("İşlemin sonucu: " + sonuc);

        scanner.close();
    }
}