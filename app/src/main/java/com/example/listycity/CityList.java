package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     * @throws
     * IllegalArgumentException if city already exists in list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether given city exists in list
     * @param city
     * @return
     * Return if city is present (TRUE or FALSE)
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from list if exists
     * @param city
     * @throws
     * IllegalArgumentException if city is present in list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in list.");
        }
        cities.remove(city);
    }

    /**
     * This returns total number of cities in list
     * @return
     * Return number of cities in list
     */
    public int countCities() {
        return cities.size();
    }
}
