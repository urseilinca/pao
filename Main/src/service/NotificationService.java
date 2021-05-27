/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import model.*;
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter;// Import the FileWriter class
import java.util.Date;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.io.BufferedWriter;
import java.io.PrintWriter;

/**
 *
 * @author Ilinca
 */
public class NotificationService {
    
    public void createFile(String path) {
        try {
        File myObj = new File("output.csv");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    
    
    public static void send(String actiune) {
    try {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();      
      FileWriter myWriter = new FileWriter("output.csv",true);
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv", true)); 
      writer.write(actiune+",");
      writer.write(dtf.format(now));
      writer.newLine();
      writer.close();
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
    
}
