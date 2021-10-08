package com.company;

public class Task {

    public static final double Th = 0.000000000001;

    public static int getMax(Cube[] cubes) {
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

    public static int NumberOfCubes(double max_area, Cube[] cubes) {
        int count = 0;
        for (int i = 0; i < cubes.length; i++) {
            if (Math.abs(cubes[i].AreaCub()-max_area) <= Th) {
                count++;
            }
        }
        return count;
    }
}
