package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<Object>{
    private String city;
    private String province;

    /**
     * Represents a City object with name and province
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets name of city
     * @return
     * city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets province of city
     * @return
     * province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compare this city to a specified city by name
     * @param o the object to be compared.
     * @return
     * a negative integer, zero, or a positive integer as this city's name is
     * less than, equal to, or greater than the specified city's name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Determines if two City objects are equal based on name and province
     * @param o
     * @return
     * Returns if city name and province are the same (TRUE or FALSE)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return this.city.equals(cityObj.getCityName()) && this.province.equals(cityObj.getProvinceName());
    }

    /**
     * This returns a hash code consistent with equals()
     * @return
     * hash code for this city
     */
    @Override
    public int hashCode() {
        return this.city.hashCode() + this.province.hashCode();
    }
}