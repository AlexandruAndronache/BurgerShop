import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    LinkedList<String> meatList = new LinkedList<>();
    LinkedList<String> breadList = new LinkedList<>();
    LinkedList<String> vegetablesList = new LinkedList<>();

    public void readBreadFromBreadFile() {


        try (Scanner scanner = new Scanner(Paths.get("src\\menu\\componenets\\bread.txt"))) {

            while (scanner.hasNextLine()) {
                String lineFromFile = scanner.nextLine();

                breadList.add(lineFromFile);
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
}
