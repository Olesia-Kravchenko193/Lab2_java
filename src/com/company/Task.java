package com.company;
import java.lang.Double;

public class Task {
    public static int getMax( Cube[] cubes) {
        int max = 0;
        double max_number = 0;
        for (int i = 0; i < cubes.length - 1; i++) {
            if (cubes[i].AreaCub() > cubes[i + 1].AreaCub()) {
                max_number = cubes[i].AreaCub();
                max = i;
            } else {
                max_number = cubes[i + 1].AreaCub();
                max = i + 1;
            }
        }
        return max;
    }

    public static int NumberOfCubes(double area, Cube[] cubes) {
        int count = 0;
        for (int i = 0; i < cubes.length; i++) {
            if (Double.compare(cubes[i].AreaCub(), area) == 0) {
                count++;
            }
        }
        return count;
    }
}
