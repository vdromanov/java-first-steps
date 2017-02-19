package test.demo;

public class Kvadrat implements Area {
    float a; //сторона

    public float getArea() {
        return a+a;
    }
    public float getPerimeter() {
        return 2*a;
    }
}
