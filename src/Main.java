import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static Menu menu = new Menu();
    private static Burger burger = new Burger();

    public static void main(String[] args) {


        menu.readBreadFromBreadFile();
        menu.printBread();

        String breadForBurger = chooseBreadFromKeyboard();
        setBread(breadForBurger);


    }

    public static String chooseBreadFromKeyboard() {

        System.out.println("Choose bread from menu, empty to quit");
        String bread;

        while (true) {
            System.out.println("Bread:");
            bread = scanner.nextLine();

            if (bread.isEmpty()) {
                break;
            }

            if (menu.checkBread(bread)) {

                System.out.println(bread + " is in the menu");
                return bread;

            } else {
                System.out.println(bread + " is not in the menu");
            }

        }
        return null;
    }

    public static void setBread(String bread) {
        if (menu.checkBread(bread)) {
            burger.setBread(bread);
            System.out.println("Main setBread OK");
        } else {
            System.out.println("Main setBread error");
        }
    }
}
