package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorter {

    private static Scanner _input = new Scanner(System.in);

    public static void sort(List<Laptop> laptop) {

        System.out.print(
                "\nДля сортировки ноутбуков по оперативной памяти нажмите 1\nДля сортировки ноутбуков по объему ЖД нажмите 2\nДля сортировки ноутбуков по ОС нажмите 3\nДля сортировки ноутбуков по цвету нажмите 4");
        System.out.println();

        if (_input.hasNextInt()) {

            choicer(_input.nextInt(), laptop);

        }

    }

    private static void choicer(int key, List<Laptop> laptop) {

        switch (key) {
            case 1:
                System.out.println("Укажите минимальное значение RAM в МБ");
                int RAM = _input.nextInt();
                filterRAM(RAM, laptop);
                break;
            case 2:
                System.out.println("Укажите минимальное значение памяти в МБ");
                int memory = _input.nextInt();
                filterMemory(memory, laptop);
                break;
            case 3:
                System.out.println(
                        "Укажите операционную систему цифрой\nWindows - 0\nLinux - 1\nMacOs - 2\nFreeBSD - 3\nDOS - 4");
                int OS = _input.nextInt();
                filterOS(OS, laptop);
                break;
            case 4:
                System.out.println(
                        "Укажите цвет ноутбука цифрой\nred - 0\ngreen - 1\nblue - 2\ngray - 3\nblack - 4\nwhite - 5");
                int Color = _input.nextInt();
                filterColor(Color, laptop);
                break;
            default:
                System.out.println("Type Error");
                break;
        }
    }

    private static void filterRAM(int result, List<Laptop> laptop) {

        List resulList = new ArrayList<>();

        for (Laptop product : laptop) {

            if (product.getRam() > result) {

                resulList.add(product);

            }
        }

        System.out.println(resulList);

    }

    private static void filterMemory(int result, List<Laptop> laptop) {

        List resulList = new ArrayList<>();

        for (Laptop product : laptop) {

            if (product.getMemorySize() > result) {

                resulList.add(product);

            }
        }

        System.out.println(resulList);

    }

    private static void filterOS(int result, List<Laptop> laptop) {

        List resulList = new ArrayList<>();

        for (Laptop product : laptop) {

            if (product.getOS().ordinal() == result) {

                resulList.add(product);

            }
        }

        System.out.println(resulList);

    }

    private static void filterColor(int result, List<Laptop> laptop) {

        List resulList = new ArrayList<>();

        for (Laptop product : laptop) {

            if (product.getColor().ordinal() == result) {

                resulList.add(product);

            }
        }

        System.out.println(resulList);

    }
}