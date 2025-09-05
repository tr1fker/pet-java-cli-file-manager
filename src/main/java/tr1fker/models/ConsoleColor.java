package tr1fker.models;

public enum ConsoleColor {
    DEFAULT("\u001B[0m"), WHITE("\u001B[29m"), BLACK("\u001B[30m"),
    RED("\u001B[31m"), GREEN("\u001B[32m"), YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"), PURPLE("\u001B[35m"), CYAN("\u001B[36m"),
    GRAY("\u001B[37m");

    private String value;

    ConsoleColor(String value){
        this.value = value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
