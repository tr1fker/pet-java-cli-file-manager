package tr1fker.handlers;

import java.util.Scanner;

public class InputHandler {
    private final static Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }

    public int inputInteger(){
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public String inputString(){
        return scanner.next();
    }
}
