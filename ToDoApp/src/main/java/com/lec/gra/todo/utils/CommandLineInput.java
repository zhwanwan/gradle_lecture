package com.lec.gra.todo.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhwanwan
 * @create 2019-07-26 3:07 PM
 */
public enum CommandLineInput {

    FIND_ALL('a'),
    FIND_BY_ID('f'),
    INSERT('i'),
    UPDATE('u'),
    DELETE('d'),
    EXIT('e');

    private final static Map<Character, CommandLineInput> INPUTS;

    static {
        INPUTS = new HashMap<>();
        for (CommandLineInput input : values()) {
            INPUTS.put(input.getShortCmd(), input);
        }

    }

    private final char shortCmd;

    CommandLineInput(char shortCmd) {
        this.shortCmd = shortCmd;
    }

    public char getShortCmd() {
        return shortCmd;
    }

    public static CommandLineInput getCommandLineInput(char input) {
        return INPUTS.get(input);
    }
}
