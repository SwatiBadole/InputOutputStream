package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
        getFileInformation();
    }
    public static void createFile(){
        File file=new File("C:\\Users\\Hp\\IdeaProjects\\InputOutputStream\\src\\test.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File Created "+file.getName());
            }else{
                System.out.println("File exist "+file.getName());
            }
        } catch (IOException e) {
            System.out.println("Error is"+ e);
            e.printStackTrace();
        }
    }
    public static void getFileInformation(){
        File file=new File("C:\\Users\\Hp\\IdeaProjects\\InputOutputStream\\src\\test.txt");
        if(file.exists()){
            System.out.println("File name " + file.getName());
            System.out.println("Readable " + file.canRead());
            System.out.println("Writable " + file.canWrite());
            System.out.println("Excecutable " + file.canExecute());
            System.out.println("Absolute path " + file.getAbsolutePath());
            System.out.println("path " + file.getPath());
            System.out.println("path " + file.length());
        }
    }
}

