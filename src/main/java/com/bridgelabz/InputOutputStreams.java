package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
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
}
