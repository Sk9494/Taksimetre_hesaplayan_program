import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km;
        double perkm = 2.20 , startprice=10,total;
        Scanner input = new Scanner(System.in);
        System.out.print(" enter the distance in kilometers : ");
        km = input.nextDouble();
        total = km * perkm;
        total += startprice;
        total = total < 20 ? 20 : total ;
        System.out.println("Totalprice : " + total);
    }
}