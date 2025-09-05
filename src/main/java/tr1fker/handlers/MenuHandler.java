package tr1fker.handlers;

import tr1fker.managers.FileManager;
import tr1fker.models.ConsoleColor;
import tr1fker.views.OutputConsole;

public class MenuHandler {
    private boolean isRunning;
    
    private FileManager fileManager;
    private OutputConsole outputConsole;
    private InputHandler inputHandler;
    
    public MenuHandler(FileManager fileManager, OutputConsole outputConsole, InputHandler inputHandler){
        this.isRunning = false;
        
        this.fileManager = fileManager;
        this.outputConsole = outputConsole;
        this.inputHandler = inputHandler;
    }
    
    public void start(){
        this.isRunning = true;
        
        while(this.isRunning){
            this.printCustomMenu();

            int choice = this.inputHandler.inputInteger();

            switch(choice){
                case 1:
                    this.printListFiles();
                    break;
                case 2:
                    this.stop();
                    break;
            }
        }
    }
    
    private void printCustomMenu(){
        this.outputConsole.print("Текущий путь:");
        this.outputConsole.print(this.fileManager.getAbsolutePath() + "\n", ConsoleColor.CYAN);
        this.outputConsole.print("""
Выберите опцию:
1. Вывести список файлов
2. Выход из программы
Введите значение:""");
    }

    private void printListFiles(){
        this.fileManager.printFiles();
    }

    public void stop(){
        this.isRunning = false;
        this.outputConsole.print("Программа успешно завершена!");
    }
}
