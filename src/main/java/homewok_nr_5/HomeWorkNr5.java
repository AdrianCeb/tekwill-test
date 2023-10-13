package homewok_nr_5;

public class HomeWorkNr5 {

    public static void main(String[] args) {






        // Создайте массив типа int с именем numbers и количество элементов 100, заполните его числами от 100 до 0

        int[] numbers = new int[100];
        for (int index = 0; index  < numbers.length;  index++ ){
            numbers[index] = index;

            System.out.println(numbers[index]);
        }


        System.out.println( "------------------------------------------------");


        //Создайте массив типа int с именем copyNumbers и скопируйте
        // все элементы из массива numbers в copyNumbers


        int[] copyNumbers = new int[100];

        System.arraycopy(numbers, 0, copyNumbers, 0, 100);
        for (int i=0; i < copyNumbers.length; i++) {
            System.out.println(copyNumbers[i]);
        }

        System.out.println( "------------------------------------------------");




        for(int index = 0; index  != numbers.length;  index++ ){
             if(numbers[index] % 2 == 0)

           System.out.println(numbers[index]);

        }

        //Используя массив numbers определите сумму четных элементов и произведение нечетных элементов
        // и выведите эти результаты на экран

        int sum = 0;
        for ( int i = 2; i < numbers.length; i=i+2){
                        // sum = sum + numbers[i];
            sum += numbers[i];
        }
        int sum2 = 0;
        for (int y = 1; y < numbers.length; y=y+2){

            sum2 += numbers[y];
        }


        System.out.println("Сумма четных элементов : " + sum);
        System.out.println("Cумма нечетных элементов : " + sum2);
    }

   //Создайте массив типа int с именем copyNumbers и скопируйте все элементы из массива numbers в copyNumber



    }






