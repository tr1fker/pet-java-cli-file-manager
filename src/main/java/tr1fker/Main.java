package tr1fker;

import tr1fker.handlers.InputHandler;
import tr1fker.handlers.MenuHandler;
import tr1fker.managers.FileManager;
import tr1fker.views.OutputConsole;

public class Main {
    public static void main(String[] args) {
        OutputConsole outputConsole = new OutputConsole();
        FileManager fileManager = new FileManager(outputConsole);
        InputHandler inputHandler = new InputHandler();

        MenuHandler menuHandler = new MenuHandler(fileManager, outputConsole, inputHandler);
        menuHandler.start();
    }
}