
package com.mycompany.luiszapatafernandobuelvasreto8;

public class Lector {
    
    String file;
    char separator;
    
    public Lector(String file, char separator){
        
        this.file = file;
        this.separator = separator;
    
    }
    
    public Lector(){
    
        this.file = null;
        this.separator = ',';
    
    }

     
    

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    
    
    public char getSeparator() {
        return separator;
    }

    public void setSeparator(char separator) {
        this.separator = separator;
    }
    
    
    
    
    
    
    
}
