package com.coderbd;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
        // Create a file object
        File file = new File("test12.txt");
         boolean fileCreated = file.createNewFile();
        boolean fileExist = file.exists();
        if (fileExist) {
            System.out.println("Exist");
        } else {
          System.out.println("Not Exist");
        }
    }
}
