import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    LinkedList<String> meatList = new LinkedList<>();
    LinkedList<String> breadList = new LinkedList<>();
    LinkedList<String> vegetablesList = new LinkedList<>();

    LinkedList<Integer> meatListPrice = new LinkedList<>();
    LinkedList<Integer> breadListPrice = new LinkedList<>();
    LinkedList<Integer> vegetablesListPrice = new LinkedList<>();

    public void readBreadFromBreadFile() {


        try (Scanner scanner = new Scanner(Paths.get("src\\menu\\componenets\\bread.txt"))) {

            while (scanner.hasNextLine()) {
                String lineFromFile = scanner.nextLine();
                String parts[] = lineFromFile.split(", ");

                breadList.add(parts[0]);
                breadListPrice.add(Integer.valueOf(parts[1]));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    public void readMeatFromMeatFile() {


        try (Scanner scanner = new Scanner(Paths.get("src\\menu\\componenets\\meat.txt"))) {

            while (scanner.hasNextLine()) {
                String lineFromFile = scanner.nextLine();
                String parts[] = lineFromFile.split(", ");

                meatList.add(parts[0]);

                meatListPrice.add(Integer.valueOf(parts[1]));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    public void readVegetablesFromVegetablesFile() {


        try (Scanner scanner = new Scanner(Paths.get("src\\menu\\componenets\\vegetables.txt"))) {

            while (scanner.hasNextLine()) {
                String lineFromFile = scanner.nextLine();
                String[] parts = lineFromFile.split(", ");

                vegetablesList.add(parts[0]);
                vegetablesListPrice.add(Integer.valueOf(parts[1]));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }


    public void setBreadList(LinkedList<String> breadList) {
        this.breadList = breadList;
    }


    public void printBread() {


        for (String s : breadList) {
            System.out.println(s);
        }
    }

    public boolean checkBread(String bread) {

        return breadList.contains(bread);


    }

    public int getBreadPrice(String bread) {
        int index = breadList.indexOf(bread);

        return breadListPrice.get(index);
    }

    public boolean checkMeat(String meat) {

        return meatList.contains(meat);
    }

    public boolean checkVegetables(String vegetables) {

        return vegetablesList.contains(vegetables);
    }

    public int getMeatPrice(String meatForBurger) {

        int index = meatList.indexOf(meatForBurger);

        return meatListPrice.get(index);
    }

    public int getVegetablePrice(String vegetableForBurger) {

        int index = vegetablesList.indexOf(vegetableForBurger);

        return vegetablesListPrice.get(index);
    }
}
