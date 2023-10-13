package homework_nr_4;

public class TemperatureConverter {

    private static double fahrenheit;

    public static void main(String[] args) {


double celsius = 21.2;

double converter = toCelsius(celsius);

       System.out.println("Температура в Фаренгейт :" + " " + converter);



        double fahrenheit = 21.2;

        double converter2 = toFahrenheit(fahrenheit);

        System.out.println("Температура в градуссах :" + " "+ converter2);

        }

        // Определите внутри класса два метода, которые будут преобразовывать температуру
    // из градусов Цельсия в градусы Фаренгейта и обратно.
    // Имена методов могут быть следующими: toCelsius() и toFahrenheit().
    // Эти два метода принимают в качестве аргумента значение температуры для
    // преобразования и возвращают преобразованное значение.


    public static double toCelsius( double celsius) {

        return ( celsius * 9 / 5 ) + 32;


    }

    public static double toFahrenheit(double fahrenheit ){
        //TemperatureConverter.fahrenheit = fahrenheit;


        // TemperatureConverter.fahrenheit = (( fahrenheit - 32 ) * 5 ) / 9;

        return ( fahrenheit - 32 ) * 5  / 9;

       // float result2;
        // result2 = (fahrenheit - 32) * 5 / 9;
        // return result2;
        //return fahrenheit;
    }
}
