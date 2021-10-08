package com.company;

public class Square {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public double getPerimetr() {
        return this.side*4;
    }

    public double getArea() {
        return this.side*this.side;
    }

    public double getDiagonal() {
        return Math.sqrt(2)*this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a = " + side +
                "  Area = " + getArea() +
                "  Diagonal = " + getDiagonal() +
                "  Perimetr = " + getPerimetr() +
                '}';
    }

}

