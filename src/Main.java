import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int value5 = 33;
        System.out.println("Before calling changeValue: " + value5);
        changeValue5(value5);
        System.out.println("After calling changeValue: " + value5);

        Integer value6 = 33;
        System.out.println("Before calling changeValue: " + value6);
        changeValue6(value6);
        System.out.println("After calling changeValue: " + value6);

        Integer[] value7 = new Integer[]{3, 4};
        System.out.println("Before calling changeValue: " + Arrays.toString(value7));
        changeValue7(value7);
        System.out.println("After calling changeValue: " + Arrays.toString(value7));

        Integer[] value8 = new Integer[]{3, 4};
        System.out.println("Before calling changeValue: " + Arrays.toString(value8));
        changeValue8(value8);
        System.out.println("After calling changeValue: " + Arrays.toString(value8));

        Person person9 = new Person("Lyapis", "Trubetskoy");
        System.out.println("Before calling changeValue: " + person9);
        changeValue9(person9);
        System.out.println("After calling changeValue: " + person9);

        Person person10 = new Person("Lyapis", "Trubetskoy");
        System.out.println("Before calling changeValue: " + person10);
        changeValue10(person10);
        System.out.println("After calling changeValue: " + person10);


    }

    public static void changeValue5(int value) {
        value = 22;
    }

    public static void changeValue6(Integer value) {
        value = 22;
    }

    public static void changeValue7(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    public static void changeValue8(Integer[] value) {
        value[0] = 99;
    }

    public static void changeValue9(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }

    public static void changeValue10(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");

    }
}