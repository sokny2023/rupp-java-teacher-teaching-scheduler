package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View view =  new View();
        view.logo();
        while (true){
            view.mainMenu();
            System.out.print("> Please chose option(1-7): ");
            int option = scanner.nextInt();
            switch (option){
                case 1 -> System.out.println("Add Teacher");
                case 2 -> System.out.println("View Teacher");
                case 3 -> System.out.println("Search Teacher");
                case 4 -> System.out.println("Update Teacher");
                case 5 -> System.out.println("Remove Teacher");
                case 6 -> view.showTime();
                case 7 -> System.out.println("Show Schedule");
                case 8 -> {
                    System.out.println("Exit Program");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option, please chose again ...!");
            }
        }
    }
}
