import java.util.Scanner;

public class TVController {

    private final television television;


    public TVController(television television) {
        this.television = television;
    }


    public void Remote() {
        Scanner s = new Scanner (System.in);

        while (television.tvOn()) {
            television.displayStatus();
            System.out.println("Remote control kunyare:");
            System.out.println("1. Change Channel");
            System.out.println("2. Increase Volume");
            System.out.println("3. Decrease Volume");
            System.out.println("4. Power Off");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the new channel number: ");
                    int newChannel = s.nextInt();
                    television.changeChannel(newChannel);
                }
                case 2 -> television.increaseVolume();
                case 3 -> television.decreaseVolume();
                case 4 -> {television.power();
                    System.out.println("Power Off...");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
