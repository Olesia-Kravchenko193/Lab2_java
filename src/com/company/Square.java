package com.company;

public class Square {
    private double a;

    public void setA(double a) {
        this.a = a;
    }
    public double getPerimetr() {
        return this.a*4;
    }

    public double getArea() {
        return this.a*this.a;
    }

    public double getDiagonal() {
        return Math.sqrt(2)*this.a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a = " + a +
                "  Area = " + getArea() +
                "  Diagonal = " + getDiagonal() +
                "  Perimetr = " + getPerimetr() +
                '}';
    }

}
class Cube extends Square {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public double getAmount() {
        return getSide()*getSide()*getSide();
    }
    public  double AreaCub(){
        return  side*side*6;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side = " + side +
                "  Amount = "+ getAmount()+
                "  Area cub = " + AreaCub()+
                '}';
    }
    public static int getMax(int size, Cube[] cubes) {
        int max = 0;
        double max_number = 0;
        for (int i = 0; i < size - 1; i++) {
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
    public  static  int NumberOfCubes(double area, Cube[] cubes)
    {
        int count = 0;
        for(int i =0; i<cubes.length; i++){
            if(cubes[i].AreaCub()==area){
                count++;
            }
        }
        return count;
    }
}

