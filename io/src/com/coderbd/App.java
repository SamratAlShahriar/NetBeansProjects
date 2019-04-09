
package com.coderbd;

import java.io.File;
import java.io.FileWriter;

public class App {
  public static void main(String[] args) {
try{    File file = new File("wow.txt");
file.createNewFile();
           FileWriter fw=new FileWriter("wow.txt");    
           fw.write("wow, Welcome Students, How are you? Are you Tired?");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}


