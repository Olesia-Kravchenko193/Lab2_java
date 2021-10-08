package com.company;

class Cube extends Square {

    public double getVolume() {
        return getSide() * getSide() * getSide();
    }

    public double AreaCub() {
        return getSide() * getSide() * 6;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side = " + getSide() +
                "  Amount = " + getVolume() +
                "  Area cub = " + AreaCub() +
                '}';
    }


}
