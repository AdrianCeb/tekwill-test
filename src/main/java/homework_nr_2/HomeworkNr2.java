package homework_nr_2;

public class HomeworkNr2 {

    public static void main(String[] args) {

        System.out.println(" Hello World!");



        //внутри метода main объявите переменные со следующими названиями и значениями (выберете подходящие)
        //CurrentWorldPopulation - 7811080815
        //CarsProducedThisYear - 55235358
        //FirstLetterInAlphabet - A
        //JavaIsAmazing - true
        //Pi - 3,14159
        //Выведите все переменные на экран используя System.out.println()

        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;

        char FirstLetterInAlphabet = 'A';

        boolean JavasAmazing = true;

        float Pi = 3.14159F;

        System.out.println( CurrentWorldPopulation );
        System.out.println( CarsProducedThisYear );
        System.out.println( FirstLetterInAlphabet );
        System.out.println( JavasAmazing );
        System.out.println( Pi );



        // Определите и инициализируйте следующие переменные
        //Price типа double с некоторым значением;
        //Tax типа double с некоторой стоимостью;
        //Quantity типа int с некоторым значением;
        //Sum типа double со значением 0;
        //Выведите все переменные на экран используя System.out.println()

        double Price;
        Price = 123456789.123456789;
        double Tax = 123456789.123456789;
        int Quantity = 10;
        double Sum = 0;

        System.out.println( Price );
        System.out.println( Tax );
        System.out.println( Quantity );
        System.out.println( Sum );

        // Определите переменную total по следующей формуле:
        // total = price + tax * quantity + sum и выведите это значение на экран


        double total = Price + Tax * Quantity + Sum;

        System.out.println( total );




    }
}
