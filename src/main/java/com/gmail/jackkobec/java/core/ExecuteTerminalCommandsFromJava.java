package com.gmail.jackkobec.java.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Jack <jackkobec>
 */
public class ExecuteTerminalCommandsFromJava {

    public static void main(String[] args) throws IOException {
        // Gets runtime
        Runtime runtime = Runtime.getRuntime();
        // Declare a command with parameters as string array
        String[] commandWithParameters = {"free", "-h"};
        // Execute command and get it process
        Process commandExecuteProcess = runtime.exec(commandWithParameters);

        // Gets input stream from process, convert it to buffered reader
        BufferedReader lineReader = new BufferedReader(new InputStreamReader(commandExecuteProcess.getInputStream()));
        // Read line by line from process input stream decorated as buffered reader
        lineReader.lines().forEach(System.out::println);

        // Gets errors input stream from process, convert it to buffered reader
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(commandExecuteProcess.getErrorStream()));
        // Read line by line from process errors input stream decorated as buffered reader
        errorReader.lines().forEach(System.out::println);
    }
}
