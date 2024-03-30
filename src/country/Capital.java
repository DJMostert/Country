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

    private Country country;
    private String cityName;

    public Capital(Country country, String cityName, String name, int population, String leaning) {
        super(name, population, leaning);
        this.country = country;
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Capital{" + "country=" + country + ", cityName=" + cityName + '}';
    }

}
