package org.fruitsalad.utility;

import com.anychart.chart.common.dataentry.DataEntry;

import org.fruitsalad.model.SaviourOfEarth;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class MockData {

    public static List<DataEntry> getMockHeatMapData() {
        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomHeatDataEntry("Jan", "Monday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Jan", "Tuesday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Jan", "Wednsday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Jan", "Monday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Jan", "Thursday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Feb", "Tuesday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Feb", "Wednsday", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Feb", "Thursday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Feb", "Wednsday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("Feb", "Wednsday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("Feb", "Tuesday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("March", "Tuesday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("March", "Tuesday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("March", "Monday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("March", "Friday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("April", "Thursday", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("April", "Thursday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("April", "Monday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("May", "Tuesday", 2, "#43a047"));
        data.add(new CustomHeatDataEntry("May", "Tuesday", 2, "#43a047"));
        data.add(new CustomHeatDataEntry("May", "Friday", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("May", "Friday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("June", "Friday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("June", "Major", 2, "#43a047"));
        data.add(new CustomHeatDataEntry("June", "Tuesday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("June", "Extreme", 2, "#43a047"));
        data.add(new CustomHeatDataEntry("July", "Wednsday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("July", "Wednsday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("July", "Saturday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("August", "Thursday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("August", "Wednsday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("August", "Saturday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("August", "Friday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("Sep", "Thursday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("Sep", "Wednsday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("Sep", "Friday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("Sep", "Thursday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("Sep", "Wednsday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("Oct", "Wednsday", 3, "#43a047"));
        data.add(new CustomHeatDataEntry("Oct", "Friday", 1, "#43a047"));
        data.add(new CustomHeatDataEntry("Oct", "Friday", 0, "#43a047"));
        data.add(new CustomHeatDataEntry("Oct", "Sunday", 2, "#43a047"));
        data.add(new CustomHeatDataEntry("Oct", "Saturday", 3, "#43a047"));

        return data;
    }

    public static LinkedHashMap<String, Integer> getAllAchievements() {
        return new LinkedHashMap<String, Integer>() {{
            put("Saviour of Earth", 100);
            put("Spawn of Satan", -10);
            put("Fat Ogre", -3);
            put("Heavenly Saint", 80);
            put("The Environmentalist", 200);
            put("Born Athlete", 150);
            put("Born Environmentalist", 450);
            put("He who loves trees", 500);
            put("Planting Trees like a Boss", 600);
        }};
    }

    public static List<String> getRandomAchievements(LinkedHashMap<String, Integer> achievements) {

        ArrayList<String> randomAchievements = new ArrayList<>();

        Random random = new Random();
        List<String> keys = new ArrayList<>(achievements.keySet());

        for (int i=0; i<4; i++) {
            randomAchievements.add(keys.get( random.nextInt(keys.size())));
        }

        return randomAchievements;
    }

    public static SaviourOfEarth getSaviourOfEarth() {
        return new SaviourOfEarth("Abhijit",
                getRandomAchievements(getAllAchievements()),
                0);
    }

    public static List<SaviourOfEarth> getSavioursOfEarth() {
        List<SaviourOfEarth> savioursOfEarth = new ArrayList<>();
        savioursOfEarth.add(new SaviourOfEarth("Abhijit",
                getRandomAchievements(getAllAchievements()),
                100));
        savioursOfEarth.add(new SaviourOfEarth("Abhilash",
                getRandomAchievements(getAllAchievements()),
                32));
        savioursOfEarth.add(new SaviourOfEarth("Prabhakar",
                getRandomAchievements(getAllAchievements()),
                4545));
        savioursOfEarth.add(new SaviourOfEarth("Harshit",
                getRandomAchievements(getAllAchievements()),
                5423));
        savioursOfEarth.add(new SaviourOfEarth("Ashwin",
                getRandomAchievements(getAllAchievements()),
                56095));
        savioursOfEarth.add(new SaviourOfEarth("Drishya",
                getRandomAchievements(getAllAchievements()),
                5463));
        savioursOfEarth.add(new SaviourOfEarth("Swathi",
                getRandomAchievements(getAllAchievements()),
                69845));
        savioursOfEarth.add(new SaviourOfEarth("Puneeth",
                getRandomAchievements(getAllAchievements()),
                332));

        return savioursOfEarth;
    }

}

