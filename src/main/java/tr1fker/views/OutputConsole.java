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
}
