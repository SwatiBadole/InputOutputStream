package com.bridgelabz;

import java.io.File;

public class DeleteOperation {
    public static void main(String[] args)
    {
        try
        {
            File f= new File("C:\\Users\\sksha\\IdeaProjects\\FileHandling\\src\\test.txt");           //file to be delete
            if(f.delete())                      //returns Boolean value
            {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            }

            else
            {
//                System.out.println("failed");
                throw new Exception("file is not deleted");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
