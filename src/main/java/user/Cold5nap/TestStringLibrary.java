package user.Cold5nap;

import java.io.PrintStream;
import java.util.Arrays;

public class TestStringLibrary {
    private final static PrintStream so = System.out;
    private static final char[] CHARS =
            {'ш', 'е', 'л', ' ', 'к', 'о', 'т', 'и', 'к'};
    private static final StringLibrary STR = new StringLibrary(CHARS);


    public static void main(String[] args) {
        isEmpty();
        indexOf();
        substring();
        trim();
        concat();
        toUpperCase();
        toLowerCase();
        substring_fromTo();
        split();
        replace();
        lastIndexOf();

    }

    public static void concat() {
        so.println("метод concat. Исходный массив" + Arrays.toString(STR.getChars()));
        StringLibrary str = new StringLibrary(CHARS);
        so.println("Добавим исходный массив.Результат: " );
        so.println(str.concat(STR).getChars());
        so.println();
    }

    public static void isEmpty() {
        so.println("метод isEmpty. Исходный массив" + Arrays.toString(STR.getChars()));
        so.println("если массив не пуст: " + STR.isEmpty());
        StringLibrary str1 = new StringLibrary(null);
        so.println("Если массив null:" + str1.isEmpty());
        char[] chars2 = {};
        StringLibrary str2 = new StringLibrary(chars2);
        so.println("если массив не null, но пуст: " + str2.isEmpty());
        so.println();
    }

    public static void indexOf() {
        so.println("метод indexOf. Исходный массив" + Arrays.toString(STR.getChars()));
        so.println("индекс буквы " + "л: " + STR.indexOf('л'));
        so.println("индекс восклицательного знака: " + STR.indexOf('!'));
        so.println();
    }

    public static void substring() {
        so.println("метод substring. Исходный массив" + Arrays.toString(STR.getChars()));
        int index = 2;
        so.println("если индекс начинается с " + index + " " +
                Arrays.toString(STR.substring(2).getChars()));
        so.println();
    }

    public static void trim() {
        StringLibrary str = new StringLibrary(
                new char[]{' ', ' ', 'л', ' ', 'к', 'о', 'т', 'и', 'к', ' ', ' ', ' '});
        so.println("метод trim. Исходный массив" + Arrays.toString(str.getChars()));
        so.println("Результат: "+ Arrays.toString(str.trim().getChars()));
        so.println();
    }

    public static void toUpperCase() {
        StringLibrary str = new StringLibrary(CHARS);
        so.println("метод toUpperCase. Исходный массив" + Arrays.toString(str.getChars()));
        so.println("Результат: "+ Arrays.toString(str.toUpperCase().getChars()));
        so.println();
    }

    public static void toLowerCase() {
        StringLibrary str = new StringLibrary(new char[]{'К','О'});
        so.println("метод toLowerCase. Исходный массив" + Arrays.toString(str.getChars()));
        so.println("Результат: "+ Arrays.toString(str.toLowerCase().getChars()));
        so.println();
    }

    public static void substring_fromTo() {
        StringLibrary str = new StringLibrary(CHARS);
        so.println("метод substring(from,to). Исходный массив" + Arrays.toString(str.getChars()));
        so.println("Со 2 по 5 индекс.Результат: "+ Arrays.toString(str.substring(2,5).getChars()));
        so.println();
    }

    public static void split() {
        StringLibrary str = new StringLibrary(CHARS);
        StringLibrary str1 = new StringLibrary(new char[]{'к','о'});

        so.println("метод split(from,to). Исходный массив" + Arrays.toString(str.getChars()));
        so.println("Regex = 'к', 'о'. Результат: " + Arrays.toString(str.split(str1)[0].getChars()));
        so.println(Arrays.toString(str.split(str1)[1].getChars()));
        so.println();
    }

    public static void replace() {
        StringLibrary str = new StringLibrary(CHARS);
        StringLibrary str1 = new StringLibrary(new char[]{'к','о'});
        StringLibrary str2 = new StringLibrary(new char[]{'А','А','А','А'});

        so.println("метод replace(str1,str2). Исходный массив" + Arrays.toString(str.getChars()));
        str.replace(new char[]{'к','о'},new char[]{'А','А','А','А'});
        so.println("заменим 'к', 'о' на 'А','А','А','А' . Результат: \n"
                + Arrays.toString(str.getChars()));
        so.println();
    }

    public static void lastIndexOf() {
        StringLibrary str = new StringLibrary(CHARS);
        so.println("метод lastIndexOf(). Исходный массив" + Arrays.toString(str.getChars()));

        so.println("последний индекс 'к'. Результат: " + str.lastIndexOf('к'));
        so.println();
    }
}

