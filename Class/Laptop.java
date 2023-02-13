package Class;

import Enum.ProductType;
import Enum.UnitType;
import Enum.Color;
import Enum.OperationSystemType;
import Enum.Brand;

public class Laptop extends Product {

    private Brand _brand;
    private Color _color;
    private int _screenSize;
    private int _memoryMain;
    private int _memoryRAM;
    private OperationSystemType _operationSystem;
    private long _serizal;

    @Override
    public String toString() {

        return String.format(
                "\nName: %s\nBrand: %s\nSKU: %s\nColor: %s\nOS: %s\nMemory: %s MB\nRAM: %s MB\nScreen: %s inch\nSerial: %s\nPrice: %s RUB\nType: %s\nUnit: %s\n",
                _name, _brand,_SKU, _color, _operationSystem, _memoryMain, _memoryRAM, _screenSize, _serizal, _price, _type,
                _unit);

    }

    public Laptop(String name,int SKU, float price, Color color, Brand brand,
        OperationSystemType system, int screen, int memory, int RAM) {

        super(name, SKU, price, ProductType.good, UnitType.piece);
        _color = color;
        _brand = brand;
        _operationSystem = system;
        _screenSize = screen;
        _memoryMain = memory;
        _memoryRAM = RAM;
        _serizal = SerialGUI.getSerialNumber();

    }

    //#region Methods
    
    public Brand getBrand(){

        return _brand;

    }

    public Color getColor() {

        return _color;

    }

    public float getScreenSize() {

        return _screenSize;

    }

    public float getMemorySize() {

        return _memoryMain;

    }

    public float getRam() {

        return _memoryRAM;

    }

    public OperationSystemType getOS() {

        return _operationSystem;

    }

    public long getSerialNum() {

        return _serizal;

    }

    //#endregion

}