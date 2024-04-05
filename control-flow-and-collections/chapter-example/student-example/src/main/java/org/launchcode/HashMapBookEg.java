package main.java.org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapBookEg {
    public static void main(String[] args) {
        HashMap<String, Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);
//        moons = {
//                "Mercury" = 0,
//                "Venus" = 0,
//                "Earth" = 1,
//                "Mars" = 2,
//                "Jupiter" = 79,
//                "Saturn" = 82,
//                "Uranus" = 27,
//                "Neptune" = 14
//        };

//
//        for(int numMoon : moons.values()) {
//            System.out.println(numMoon);
//        }
        moons.put("Pluto", 5);
//        for(String moon : moons.keySet()) {
//            System.out.println(moon);
//        }
        for (Map.Entry<String, Integer> moon : moons.entrySet()) {
            System.out.println(moon.getKey());
//        }
        System.out.println(moons.containsKey("Earth"));
            System.out.println(moons.containsValue(79));
        }
    }
}
