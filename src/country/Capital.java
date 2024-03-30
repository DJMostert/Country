/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package country;

/**
 *
 * @author Daniel Mostert
 */
public class Capital extends Country {

    private String cityName;

    public Capital(String cityName, String name, int population, String leaning) {
        super(name, population, leaning, cityName);
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return  cityName + " + cityName + '}'";
    }

}
