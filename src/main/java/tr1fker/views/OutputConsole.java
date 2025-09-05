package tr1fker.views;

import tr1fker.models.ConsoleColor;

public class OutputConsole {
    private final static ConsoleColor defaultConsoleColor;

    static{
        defaultConsoleColor = ConsoleColor.DEFAULT;
    }

    public static void setDefaultColor(String value){
        defaultConsoleColor.setValue(value);
        System.out.println(defaultConsoleColor.getValue());
    }

    public void print(String message){
        System.out.print(message);
    }

    public void print(String message, ConsoleColor color){
        System.out.print(color.getValue() + message + defaultConsoleColor.getValue());
    }

    public void printINumber(){
        this.print("Введите значение:");
    }

    public void printINameDir(){
        this.print("Введите название директории:");
    }

    public void printINameDirFile(){
        this.print("Введите название папки либо файла:");
    }

    public void printSCreated(){
        this.print("Успешно создана!\n");
    }

    public void printSDel(){
        this.print("Успешно удалена!\n");
    }

    public void printSRenamed(){
        this.print("Успешно переименовано!\n");
    }
}
