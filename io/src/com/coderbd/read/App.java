package com.coderbd.read;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {

    public static void main(String[] args) throws Exception {
        String srcFile = "wow.txt";
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        String text = null;
        while ((text = br.readLine()) != null) {
            System.out.println(text);
        }
        br.close();
    }

}
