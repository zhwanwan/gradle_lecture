package com.lec.gra.todo;

import com.lec.gra.todo.utils.CommandLineInput;
import com.lec.gra.todo.utils.CommandLineInputHandler;
import org.apache.commons.lang3.CharUtils;

/**
 * @author zhwanwan
 * @create 2019-07-26 3:06 PM
 */
public class ToDoApp {

    public static final char DEFAULT_INPUT = '\u0000';

    public static void main(String[] args) {

        CommandLineInputHandler commandLineInputHandler = new CommandLineInputHandler();
        char command = DEFAULT_INPUT;
        while (CommandLineInput.EXIT.getShortCmd() != command) {
            commandLineInputHandler.printOptions();
            String input = commandLineInputHandler.readInput();
            /*char[] inputChars = input.length() == 1 ? input.toCharArray() : new char[]{DEFAULT_INPUT};
            command = inputChars[0];*/
            command = CharUtils.toChar(input, DEFAULT_INPUT);
            CommandLineInput commandLineInput = CommandLineInput.getCommandLineInput(command);
            commandLineInputHandler.processInput(commandLineInput);
        }
        /*Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }*/
    }

}
