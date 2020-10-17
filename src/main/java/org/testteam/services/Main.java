package org.testteam.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter(new File("filename.txt"));
        fileWriter.write("Hello, world");
        fileWriter.close();
    }
    ;;;;;;
}
