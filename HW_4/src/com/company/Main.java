package com.company;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lib program = new Lib();
        //1.Объявите пустой массив с идентификатором arr.
	    int [] arr = new int [0];
        // 2.Объявите массив byte с идентификатором byteArray на 26 элементов.
        byte [] byteArray = new byte [26];
        //3.Объявите массив строк с идентификатором stringArray на 10 элементов.
	    String [] stringArray = new String [10];
        //4.Объявите массив строк с идентификатором daysOfWeek  и проинициализируйте его названиями дней недели.
	    String [] daysOfWeek = {
                "Понедельник",
                "Вторник",
                "Среда",
                "Четверг",
                "Пятница",
                "Суббота",
                "Воскресенье"
        };
        //5.Составить программу вывода на экран любого элемента массива по его индексу
        program.dayOfWeek(daysOfWeek, 3);

        /*
        6.Заполнить массив из восьми элементов следующими значениями:
            первый элемент массива равен 37,
            второй — 0, третий — 50,
            четвертый — 46,
            пятый — 34,
            шестой — 46,
            седьмой — 0,
            восьмой —13.
         */
        Integer [] arrEightEl = {
                37,
                0,
                50,
                46,
                34,
                46,
                0,
                13
        };
        /*
        7.Заполнить массив из восьми элементов таким образом,
            чтобы значения элементов при просмотре массива слева направо образовывали:
        б) возрастающую последовательность.
        */
        //а) убывающую последовательность;
        Arrays.sort(arrEightEl, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrEightEl));
        //б) возрастающую последовательность.
        Arrays.sort(arrEightEl);
        System.out.println(Arrays.toString(arrEightEl));

        //7.1 Возможно я снова не так понял задачу поэтому продублировал еще раз по другому
        byte [] arrEightElOne = {
                50,
                46,
                46,
                37,
                34,
                13,
                0,
                0
        };

        byte [] arrEightElTwo = {
                0,
                0,
                13,
                34,
                37,
                46,
                46,
                50
        };
        System.out.println(Arrays.toString(arrEightElOne));
        System.out.println(Arrays.toString(arrEightElTwo));

       /*
       8.Дан массив целых чисел. Выяснить:
        а) является ли s-й элемент массива положительным числом;
        б) является ли k-й элемент массива четным числом;
        в) какой элемент массива больше: k-й или s-й.
       */

        int s = arrEightElTwo[2];
        int k = arrEightElTwo[3];

       // а) является ли s-й элемент массива положительным числом;
        program.isEven(s, "s");
       // б) является ли k-й элемент массива четным числом;
        program.isEven(k, "k");
       // в) какой элемент массива больше: k-й или s-й.
        program.whoLarger(s, k);

        /*
        9.Дан двумерный массив.
            а) Вывести на экран элемент, расположенный в правом верхнем углу массива.
            б) Вывести на экран элемент, расположенный в левом нижнем углу массива.
         */
        int [] [] arrMatrix = {
                {1,2},
                {3,4},
                {5,6}
        };
        //а) Вывести на экран элемент, расположенный в правом верхнем углу массива.
        program.arrCheck(arrMatrix, 0, 0, "элемент массива расположенный в правом верхнем углу массива - ");
        //б) Вывести на экран элемент, расположенный в левом нижнем углу массива.
        program.arrCheck(arrMatrix, 2, 1, "элемент массива расположенный в левом нижнем углу массива - ");
        /*
        10. Дан двумерный массив.
            а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
            б) Вывести на экран элемент, расположенный в левом верхнем углу массива.
         */
        //а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
        program.arrCheck(arrMatrix, 2, 0, "элемент массива расположенный в правом нижнем углу массива - ");
        //б) Вывести на экран элемент, расположенный в левом верхнем углу массива.
        program.arrCheck(arrMatrix, 0, 1, "элемент массива расположенный в левом верхнем углу массива - ");
        /*
        11. Дан двумерный массив. Составить программу:
            а) вывода на экран любого элемента второй строки массива;
            б) вывода на экран любого элемента массива.
         */
        //а) вывода на экран любого элемента второй строки массива;
        program.arrCheck(arrMatrix, 1, 1, "вывода на экран любого элемента второй строки массива - ");
        //б) вывода на экран любого элемента массива.
        program.arrCheck(arrMatrix, 2, 1, "вывода на экран любого элемента массива - ");
    }
}
