package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *тест
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    
    private float storona1;
    private float storona2;

    public void setStorona1(float storona1) {
        this.storona1 = storona1;
    }

    public void setStorona2(float storona2) {
        this.storona2 = storona2;
    }

    public float getStorona1() {
        return storona1;
    }

    public float getStorona2() {
        return storona2;
    }

    public Rectangle(float storona1, float storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }
    private float SRectangle;
    private float perRectangle;

    @Override
    public float getPerimeter() {
        perRectangle = (storona1 + storona2) * 2;
        return perRectangle;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getArea() {
        SRectangle = storona1 * storona2;
        return SRectangle;
    }
}
