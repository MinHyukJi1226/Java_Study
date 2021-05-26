package kr.hs.dgsw.java.c2.file;

import java.io.File;

public class Command {

    protected String[] tokens;

    protected File currentDirectory;

    public Command(String[] tokens, File currentDirectory){
        this.tokens = tokens;
        this.currentDirectory = currentDirectory;
    }

    public boolean isExit() {
       return false;
    }

    public abstract void execute();

    public static Command build (String[] tokens, File currentDirectory) {
        if (tokens[0].equals("ls")){
            return new CommandLs(tokens, currentDirectory);
        } else if (tokens[0].equals("quit")){
            return new CommandExit(tokens, currentDirectory);
        } else {
            throw new RuntimeException("잘못된 명령어 입니다.");
        }
    }
}
