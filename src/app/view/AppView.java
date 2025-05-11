package app.view;

import java.util.Scanner;

public class AppView {
    private static final Scanner scanner = new Scanner(System.in);


    public String getInputStreet() {
        System.out.print("Input street name: ");
        return scanner.nextLine();
    }

    public String inputUserName() {
        System.out.print("Input User name: ");
        return scanner.nextLine();
    }

    public String inputBuildingNumber() {
        System.out.print("Input building number: ");
        return scanner.nextLine();
    }
}
