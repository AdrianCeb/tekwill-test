package homework_nr_3;

public class NomeworkNr3_3 {

    // Внутри метода main напишите цикл(ы) который(е) отображает(ют)
    // в консоль сумму следующей серии:
    // 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99


    public static void main(String[] args) {

        double sum = 0.0;
        for (double i = 1.0; i <= 97; i += 2) {
            sum += i / (i + 2);

            System.out.println("Sum of series" + sum);
        }
    }
}

