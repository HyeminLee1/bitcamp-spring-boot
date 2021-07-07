package com.lecture._0706;

 class CircleA {
    //상수
    final double PI = 3.141592;
    double radius;

    public CircleA(double radius) {
        this.radius = radius;
    }

    //기능
    public double area(double rad) {
        double result = rad * rad * 3.14;
        return result;
    }

    public double area(CircleA cir) {
        double result = cir.radius * cir.radius * 3.14;
        return result;
    }
}
    public class Circle {
        public static void main(String[] args) {

            CircleA c1 = new CircleA(5.0);
            CircleA c2 = new CircleA(3.0);

            System.out.println(c1.area(c1));
        }
    }




