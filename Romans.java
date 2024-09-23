//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aadhav Sivakumar

import java.util.Map;
import java.util.HashMap;

public class Romans {
    private Map<String, Integer> m;

    // Constructor to initialize the map with Roman numerals and their values
    public Romans() {
        m = new HashMap<>();
        m.put("I", 1);
        m.put("V", 5);
        m.put("X", 10);
        m.put("L", 50);
        m.put("C", 100);
        m.put("D", 500);
        m.put("M", 1000);
    }

    // Method to return the numeric value of a given Roman numeral
    public int getValue(String roman) {
        return m.get(roman);  // Return the value or -1 if the numeral doesn't exist
    }
}



