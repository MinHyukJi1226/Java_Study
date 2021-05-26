package kr.hs.dgsw.java.c2.file;

import java.io.File;
import java.util.Scanner;

public class Cmd {

    private Scanner scanner;

    private File currentDirectory;

    public Cmd(){
        currentDirectory = new File("C:/");
    }

    public void execute() {
        this.scanner = new Scanner(System.in);

        while (true) {

            try {
                showPrompt();
            } catch (Exception e) {

            }
            // 프롬프터를 출력한다.


            // 사용자 명령을 입력받는다.
            Command command = inputCommand();
            if (command.isExit()) {
                break;
            }
            // 사용자 명령을 수행한다.
            command.execute();
        }

        scanner.close();
    }

    private void showPrompt() {
        String str = String.format("%s>", currentDirectory.getAbsolutePath());
        System.out.println(str);
    }

    private Command inputCommand() {
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");

        return Command.build(tokens, currentDirectory);
    }
}
