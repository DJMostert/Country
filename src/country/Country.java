/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package country;

/**
 *
 * @author Daniel Mostert
 */
public class Country {
    private String name;
    private int population;
    private String leaning;

    public Country(String name, int population, String leaning, String cityName) {
        this.name = name;
        this.population = population;
        this.leaning = leaning;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getLeaning() {
        return leaning;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLeaning(String leaning) {
        this.leaning = leaning;
    }
    
    public String toString(){
        String line1 = "Country: " + name;
        String line2 = "\nPopulation: " + population;
        String line3 = "\nPolitical leaning: " + leaning;
        return line1 + line2 + line3;
    }

    boolean compareTo(Country country) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
