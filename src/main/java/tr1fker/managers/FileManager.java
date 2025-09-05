package tr1fker.managers;

import tr1fker.views.OutputConsole;

import java.io.File;

public class FileManager {
    private static final File file;

    static{
        file = new File("");
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
}
