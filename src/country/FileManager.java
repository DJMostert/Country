/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package country;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Daniel Mostert
 */
public class FileManager {
    private Country[]objCon = new Country[500];
    int count = 0;

    public FileManager() {
        try{
            BufferedReader ff = new BufferedReader ( new FileReader ("Country.txt"));
            String line;
            while((line = ff.readLine()) != null){
                String[]part = line.split("#");
                String name = part[0];
                int population = Integer.parseInt(part[1]);
                String leaning = part[2];
                String cityName = part[3];
                objCon[count] = new Country(name, population, leaning, cityName);
                count++;
            }
            ff.close();
        }
        
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void Sort(){
        for(int i = 0; i<count-1; i++){
            for(int j = i+1; j<count; j++){
                if(objCon[i].getName().compareToIgnoreCase(objCon[j].getName()) > 0){
                    Country temp = objCon[i];
                    objCon[i] = objCon[j];
                    objCon[j] = temp;
                }
            }
            
        }
    }
    
    public String Search(String cName){
        for(int i = 0; i<count; i++){
            if(objCon[i].getName().equals(cName)){
                return objCon.toString();
            }
        }
        return "Country does not exist.";
    }
    
}
