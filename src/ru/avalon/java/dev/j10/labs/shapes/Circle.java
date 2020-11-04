package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    
    private float R;
    private float C;
    private float SCircle;

    public Circle(float R, float C) {
        this.R = R;
        this.C = C;
    }
    
    public float getR() {
        return R;
    }

    public float getC() {
        return C;
    }

    public void setR(float R) {
        this.R = R;
    }

    public void setC(float C) {
        this.C = C;
    }
    
    

    @Override
    public float getLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getArea() {
      SCircle = R * R* 3.14f;
        return SCircle; 
    
    }
}
