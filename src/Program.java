import java.time.LocalDate;
import java.util.Scanner;
 // Scanner meny oppgåve 
public class Program {
    //# Objects
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("Pick a number (1-3)");
            System.out.println("1: Do something");
            System.out.println("2: Enter a date");
            System.out.println("3: quit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> doSomething();
                case 2 -> enterDate();
                case 3 -> quit();
                default -> System.out.println("Enter 1-2, please :)");
            }
        }
    }

    private void quit() {
        System.out.println("Bye!");
    }

    private void enterDate() {
        System.out.println("Please enter a date on format YYYY-MM-DD");
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
        LocalDate date = LocalDate.parse(s);
        System.out.println("You entered " + date);
    }

    private void doSomething() {
        System.out.println("Doing something");
    }
   //# Method that runs the program
    public static void main(String[] args) {
        for (String s:
        args){
            System.out.println(s);
        }
        Program p = new Program();
        p.run();
    }
}
