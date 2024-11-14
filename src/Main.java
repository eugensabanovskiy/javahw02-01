import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите цену билета: ");
        int ticketPrice = in.nextInt();
        int bonusMiles = ticketPrice / 20;

        System.out.printf("Ваши бонусные мили: %d \n", bonusMiles);
        in.close();
    }
}