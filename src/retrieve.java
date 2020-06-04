import java.io.*;
// Whatever in between

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihir
 */
public class retrieve {
public static String execCommand(String command){
    String F="";
    try{
      Process process = Runtime.getRuntime().exec(command);
      String line;
      BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      while( (line = reader.readLine()) != null ){
        F += line + "\n";
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
      F=e.getMessage();
    }
    return F;
  };
}
