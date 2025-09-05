package tr1fker.managers;

import tr1fker.models.ConsoleColor;
import tr1fker.views.OutputConsole;

import java.io.File;

public class FileManager {
    private static File file;

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
        this.outputConsole.print("Количество файлов и папок:" + files.length + "\n");
        for (File f : files){
            this.outputConsole.print(f.getName() + "\n", f.isFile() ? ConsoleColor.BLUE : ConsoleColor.YELLOW);
        }
    }

    public void toParent(){
        file = file.getParentFile();
    }

    public void changeDirectory(String name){
        file = new File(getAbsolutePath() + File.separator + name);
    }

    public void createDirectory(String name){
        File newFile = new File(this.getAbsolutePath() + File.separator + name);
        newFile.mkdir();
    }

    public void deleteDirFile(String name){
        File deleteFile = new File(this.getAbsolutePath() + File.separator + name);
        deleteFile.delete();
    }
}
