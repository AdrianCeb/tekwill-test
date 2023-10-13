package homework_nr_4;

public class Circle {

    public static void main(String[] args) {




        int radius = 5;

       double result = calculateArea(radius);

        System.out.println("The area of the circle : " + result);




    }


    // Определите внутри класса переменную с именем radius и метод с именем calculateArea().
// Внутри метода используйте соответствующую формулу для вычисления площади круга,
// используя значение радиуса в переменной radius. После расчета отобразите площадь на консоли.


    public static double calculateArea(int radius) {

        double area;
        area = radius * radius * Math.PI;

        return area;
    }
}








