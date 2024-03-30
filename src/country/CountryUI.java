/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package country;

/**
 *
 * @author Daniel Mostert
 */
public class CountryUI {
    public static void main(String[]args){
        FileManager man = new FileManager();
        man.Sort();
        System.out.println(man.Display());
    }
    
}
