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
                    this.changeDirectory();
                    break;
                case 3:
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
2. Сменить директорию
3. Выход из программы
""");
        this.outputConsole.printINumber();
    }

    private void printListFiles(){
        this.fileManager.printFiles();
    }

    private void changeDirectory(){
        this.outputConsole.print("""
1. Вернуться в прошлую директорию
2. Зайти в новую
""");
        this.outputConsole.printINumber();

        int option = this.inputHandler.inputInteger();
        switch(option){
            case 1:
                this.fileManager.toParent();
                break;
            case 2:
                this.outputConsole.printINameDir();
                String name = this.inputHandler.inputString();
                this.fileManager.changeDirectory(name);
                break;
        }
    }

    public void stop(){
        this.isRunning = false;
        this.outputConsole.print("Программа успешно завершена!");
    }
}
