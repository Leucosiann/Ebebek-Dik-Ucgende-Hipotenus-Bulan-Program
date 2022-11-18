import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c, c2, u, alan, cevre, err;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik üçgenin Alan, Çevre ve Hipotenusunu Bulma \n");
        System.out.println("Lütfen İstenilen Bilgileri Giriniz");

        System.out.println("Taban Ölçüsünü Girin: ");
        a = input.nextDouble();
        System.out.println("Yüksekik Ölçüsünü Girin:");
        b = input.nextDouble();

        c2 = (a*a)+(b*b);
        c = Math.sqrt(c2);

        System.out.println("Hipotenüs:" + c + "br" + "\n");
        u = (a+b+c)/2;

        System.out.println("Üçgenin Çevresi:" + (2*u) +"br" + "\n");
        alan = u*(u-a) * (u-b) * (u-c);

        System.out.println("Üçgenin Alanı:" +(Math.sqrt(alan))+"br");
    }
}