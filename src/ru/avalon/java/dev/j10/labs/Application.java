package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        
        Circle circle1 = new Circle(2.1f,2.5f);
        Circle circle2 = new Circle(3.1f,2.9f);
        Circle circle3 = new Circle(4.1f,1.9f);
        Triangle triangle1 = new Triangle(3.1f,5.2f,1.2f,3.2f,4.5f);
        Triangle triangle2 = new Triangle(67.1f,5.2f,1.2f,9.2f,4.5f);
        Triangle triangle3 = new Triangle(55.1f,9.2f,1.2f,3.2f,4.5f);
        Triangle triangle4 = new Triangle(55.1f,39.2f,1.2f,3.2f,4.5f);
        Rectangle rectangle1 = new Rectangle(2.3f,4.5f);
        Rectangle rectangle2 = new Rectangle(6.3f,8.5f);
        Rectangle rectangle3 = new Rectangle(5.3f,14.5f);
        
        shapes[0] = circle1;
        shapes[1] = triangle1;
        shapes[2] = triangle2;
        shapes[3] = circle2;
        shapes[4] = rectangle1;
        shapes[5] = rectangle2;
        shapes[6] = rectangle3;
        shapes[7] = circle3;
        shapes[8] = triangle3;
        shapes[9] = triangle4;
        
        
     Application.MaxS(shapes);
     
     System.out.println("Периметр первого треугольника " + triangle1.getPerimeter());
     System.out.println("Периметр второго треугольника " + triangle2.getPerimeter());
      
     System.out.println("Длина первой окружности " + circle1.getLength());
     System.out.println("Длина второй окружности " + circle2.getLength());
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *тест
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }
    
    public static void MaxS(Shape[] shapes){
        float MaxS = 0;
        for (int i = 0; i < shapes.length; i++){
            if (shapes[i].getArea() >= MaxS){
                MaxS = shapes[i].getArea();
               System.out.println(shapes[i].getArea());
            }
            
              
//            else {
//                
//            }
        }
         System.out.println("фигура с наибольшей площадью - " + MaxS);
        
    }
}
