package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1;
        double sum=0;
        do {
            System.out.println("Введите кол-во квадратов: ");
            N1 = scanner.nextInt();
        } while (N1 < 1);
        Square[] square = new Square[N1];
        for (int i=0; i<N1; i++) {
            square[i] = new Square();
            System.out.print("Сторона квадрата №" + (i + 1) + " а = ");
            square[i].setA(scanner.nextDouble());
            System.out.println(square[i].toString());
            sum+=square[i].getArea();
        }
        System.out.println("Средняя площадь квадратов: "+ sum/2+"\n");


        int N2;
        do {
            System.out.println("Введите кол-во кубов: ");
            N2 = scanner.nextInt();
        }while (N2<1);
        Cube[] cube = new Cube[N2];
        for (int i=0; i<N2; i++) {
            cube[i] = new Cube();
            System.out.print("Сторона куба №" + (i + 1) + " b = ");
            cube[i].setSide(scanner.nextDouble());
            System.out.println(cube[i].toString());
        }
        System.out.println("Максимальная площадь куба: " + cube[Cube.getMax(N2,cube)].AreaCub());
        System.out.println("Кол-во кубов с найбольшей площадью: "+ Cube.NumberOfCubes(cube[Cube.getMax(N2,cube)].AreaCub(),cube));
    }
}

