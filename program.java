import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Class.*;
import Enum.*;

class program {

    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<Laptop>(Arrays.asList(
                new Laptop("Cruise", 3332, 55_990, Color.white, Brand.Hp, OS.Windows, 14, 2048, 4096),
                new Laptop("Cruise", 3322, 72_990, Color.blue, Brand.Hp, OS.Windows, 15, 4096, 16384),
                new Laptop("Spider", 4532, 36_990, Color.black, Brand.Asus, OS.FreeBSD, 15, 1024,4096),
                new Laptop("Spider", 4533, 43_990, Color.blue, Brand.Asus, OS.Windows, 15, 1024, 4096),
                new Laptop("Laguna", 1242, 25_990, Color.red, Brand.Dell, OS.Linux, 13, 512, 4096),
                new Laptop("Laguna", 1244, 28_990, Color.gray, Brand.Dell, OS.Windows, 13, 512, 4096),
                new Laptop("Macbook Air", 98074, 89_990, Color.green, Brand.Apple, OS.MacOs, 13, 1024,8192)));

        Sorter.sort(laptops);

    }

}