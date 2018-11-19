import java.util.Scanner;

class Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How long until you heard the sound?");
        double timer = scanner.nextDouble();

        double distance = timer * 1100;

        System.out.println("The sound is " + distance + " feet away.");
    }
}