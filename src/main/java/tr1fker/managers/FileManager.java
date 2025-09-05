package tr1fker.managers;

import tr1fker.models.ConsoleColor;
import tr1fker.views.OutputConsole;

import java.io.File;

public class FileManager {
    private static final File file;

    static{
        file = new File(".");
    }

    private OutputConsole outputConsole;

    public FileManager(OutputConsole outputConsole){
        this.outputConsole = outputConsole;
    }

    public String getAbsolutePath(){
        return file.getAbsolutePath();
    }

    public String getPath(){
        return file.getPath();
    }

    public void printFiles(){
        File[] files = file.listFiles();
        if (files == null){
            this.outputConsole.print("Директория пуста!\n");
            return;
        }
        this.outputConsole.print("Количество:" + files.length + "\n");
        for (File f : files){
            this.outputConsole.print(f.getName() + "\n", f.isFile() ? ConsoleColor.BLUE : ConsoleColor.DEFAULT);
        }
    }
}
