import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static Menu menu = new Menu();
    private static Burger burger = new Burger();

    public static void main(String[] args) {

        readMenu();
        createBurger();


    }

    public static void readMenu() {
        menu.readBreadFromBreadFile();
        menu.readMeatFromMeatFile();
        menu.readVegetablesFromVegetablesFile();
    }

    public static void createBurger() {
        String breadForBurger = chooseBreadFromKeyboard();
        setBread(breadForBurger);

        String meatForBurger = chooseMeatFromKeyboard();
        setMeat(meatForBurger);

        String vegetableForBurger = chooseVegetablesFromKeyboard();
        setVegetables(vegetableForBurger);

        System.out.println("Bread for burger: " + burger.getBread());
        System.out.println("Meat for burger: " + burger.getMeat());
        System.out.println("Vegetable for burger: " + burger.getVegetable());


        System.out.println("Check: \n" + "\n" + "Bread: " + menu.getBreadPrice(breadForBurger));
        System.out.println("Meat: " + menu.getMeatPrice(meatForBurger));
        System.out.println("Vegetable: " + menu.getVegetablePrice(vegetableForBurger));
        System.out.println("===============");
        System.out.println("Total: " + (menu.getBreadPrice(breadForBurger) + menu.getMeatPrice(meatForBurger) + menu.getVegetablePrice(vegetableForBurger)));
        System.out.println("Thank you for ordering!");
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

    public static String chooseMeatFromKeyboard() {

        System.out.println("Choose meat from menu, empty to quit");
        String meat;

        while (true) {
            System.out.println("Meat:");
            meat = scanner.nextLine();

            if (meat.isEmpty()) {
                break;
            }

            if (menu.checkMeat(meat)) {

                System.out.println(meat + " is in the menu");
                return meat;

            } else {
                System.out.println(meat + " is not in the menu");
            }

        }
        return null;
    }

    public static String chooseVegetablesFromKeyboard() {

        System.out.println("Choose vegetables from menu, empty to quit");
        String vegetables;

        while (true) {
            System.out.println("Vegetables:");
            vegetables = scanner.nextLine();

            if (vegetables.isEmpty()) {
                break;
            }

            if (menu.checkVegetables(vegetables)) {

                System.out.println(vegetables + " is in the menu");
                return vegetables;

            } else {
                System.out.println(vegetables + " is not in the menu");
            }

        }
        return null;
    }


    public static void setBread(String bread) {
        if (menu.checkBread(bread)) {
            burger.setBread(bread);

        } else {
            System.out.println("Main setBread error");
        }
    }

    public static void setMeat(String meat) {
        if (menu.checkMeat(meat)) {
            burger.setMeat(meat);

        } else {
            System.out.println("Main setMeat error");
        }
    }

    public static void setVegetables(String vegetables) {
        if (menu.checkVegetables(vegetables)) {
            burger.setVegetable(vegetables);

        } else {
            System.out.println("Main setVegetables error");
        }
    }


}
