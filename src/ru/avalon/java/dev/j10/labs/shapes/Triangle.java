package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *тест
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    private float a; //основание
    private float h; //высота
    private float storA;
    private float storB;
    private float storC;
    private float perTriangle;
    private float STringle;

    public void setA(float a) {
        this.a = a;
    }

    public void setH(float h) {
        this.h = h;
    }

    public void setStorA(float storA) {
        this.storA = storA;
    }

    public void setStorB(float storB) {
        this.storB = storB;
    }

    public void setStorC(float storC) {
        this.storC = storC;
    }

    public float getA() {
        return a;
    }

    public float getH() {
        return h;
    }

    public float getStorA() {
        return storA;
    }

    public float getStorB() {
        return storB;
    }

    public float getStorC() {
        return storC;
    }

    public Triangle(float a, float h, float storA, float storB, float storC) {
        this.a = a;
        this.h = h;
        this.storA = storA;
        this.storB = storB;
        this.storC = storC;
    }
  

    
 
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getArea() {
        
        STringle = (a / 2) * h;
        return STringle;
    }

    @Override
    public float getPerimeter() {
        
        return perTriangle = storA + storB + storC;
        
    }
}
