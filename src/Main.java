public class Main {
    public static void main(String[] args) {
        int bonusMile = 20;
        long ticketPrice = 10_400;

        long accruedMiles = ticketPrice / bonusMile;
        System.out.println(accruedMiles);

    }
}
