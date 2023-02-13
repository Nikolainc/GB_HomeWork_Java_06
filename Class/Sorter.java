package Class;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
                System.out.println(laptop.stream().filter(element -> element.getRam() > RAM).collect(Collectors.toList()));
                break;
            case 2:
                System.out.println("Укажите минимальное значение памяти ЖД в ГБ");
                int memory = _input.nextInt();
                System.out.println(laptop.stream().filter(element -> element.getMemorySize() > memory).collect(Collectors.toList()));
                break;
            case 3:
                System.out.println("Укажите операционную систему цифрой\nWindows - 0\nLinux - 1\nMacOs - 2\nFreeBSD - 3\nDOS - 4");
                int OS = _input.nextInt();
                System.out.println(laptop.stream().filter(element -> element.getOS().ordinal() == OS).collect(Collectors.toList()));
                break;
            case 4:
                System.out.println(
                        "Укажите цвет ноутбука цифрой\nred - 0\ngreen - 1\nblue - 2\ngray - 3\nblack - 4\nwhite - 5");
                int color = _input.nextInt();
                System.out.println(laptop.stream().filter(element -> element.getColor().ordinal() == color).collect(Collectors.toList()));
                break;
            default:
                System.out.println("Type Error");
                break;
        }
    }
}