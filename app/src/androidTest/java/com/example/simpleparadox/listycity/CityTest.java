package com.example.simpleparadox.listycity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CityTest {
    @Test
    public void ConcatCityProvinceTest(){
        City c1 = new City("A", "B");
        assertEquals("AB", c1.concat());
    }
}
