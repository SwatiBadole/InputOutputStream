package com.bridgelabz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
        getFileInformation();
        writingToFile();
        readFile();

    }

    public static void createFile() {
        File file = new File("C:\\Users\\Hp\\IdeaProjects\\InputOutputStream\\src\\test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File Created " + file.getName());
            } else {
                System.out.println("File exist " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Error is" + e);
            e.printStackTrace();
        }
    }

    public static void getFileInformation() {
        File file = new File("C:\\Users\\Hp\\IdeaProjects\\InputOutputStream\\src\\test.txt");
        if (file.exists()) {
            System.out.println("File name " + file.getName());
            System.out.println("Readable " + file.canRead());
            System.out.println("Writable " + file.canWrite());
            System.out.println("Excecutable " + file.canExecute());
            System.out.println("Absolute path " + file.getAbsolutePath());
            System.out.println("path " + file.getPath());
            System.out.println("path " + file.length());
        }
    }

    public static void writingToFile(){
        File file = new File("C:\\Users\\Hp\\IdeaProjects\\InputOutputStream\\src\\test.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            String contentOfFile="A WRITE statement cannot be used to update a " +
                    "consecutive data set accessed as a SEQUENTIAL UPDATE file. " +
                    "In order to update a consecutive data set by a SEQUENTIAL " +
                    "UPDATE file, you must retrieve a record with a READ statement " +
                    "before you can update it by a REWRITE statement.";
            fileWriter.write(contentOfFile);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\Hp\\IdeaProjects\\InputOutputStream\\src\\test.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String readLine = scanner.nextLine();
                System.out.println(readLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}