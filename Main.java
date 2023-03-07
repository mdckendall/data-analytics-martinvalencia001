import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> students = new ArrayList<>();
    FileReader fr = new FileReader("names.txt");
    Scanner fileScanner = new Scanner(fr);

    while (fileScanner.hasNextLine()) {
      String name = fileScanner.nextLine();
      students.add(name);
    }

    boolean quit = false;
    while (!quit) {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("$98,345 average salary in South Florida!");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          System.out.println("Current Students:");
          for (String student : students) {
            System.out.println(student);
          }
          break;
        case 5:
          quit = true;
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    }

    scanner.close();
  }
}