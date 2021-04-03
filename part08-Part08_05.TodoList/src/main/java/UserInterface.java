
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            String input = userInput("Command: ");
            if (input.equals("stop")) {
                return;
            }
            if (input.equals("add")) {
                add();
            }
            if (input.equals("remove")) {
                remove();
            }
            if (input.equals("list")) {
                list();
            }
        }
    }

    private String userInput(String displayToUser) {
        System.out.println(displayToUser);
        String input = this.scanner.nextLine();
        return input;
    }

    private void add() {
        String input = userInput("To add: ");
        this.list.add(input);
    }

    private void remove() {
        int input = Integer.valueOf(userInput("Which one is removed? "));
        this.list.remove(input);
    }

    private void list() {
        this.list.print();
    }

}
