
package com.mycompany.luiszapatafernandobuelvasreto8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    
    public static final String SEPARATOR =",";
    
    
    
    
    
    public static void main(String[] args) throws IOException{
        

   
        BufferedReader br = null;
        
        try {
        
            br = new BufferedReader(new FileReader("C:/Users/luisf/Desktop/U/2021 - 1/TECNICAS DE PROG/TSLA.csv"));
            
            String line = br.readLine();
            
            while (null!=line) {
            String [] fields = line.split(SEPARATOR);
            System.out.println(Arrays.toString(fields));
            
            line = br.readLine();
            
            System.out.println(fields[1]);
            
         }
         
      } catch (IOException e) {
          
      } finally {
         if (null!=br) {
            br.close();
         }
         
            
        
        }
        
        
        
        
    }
    
    
    
    
    
}
