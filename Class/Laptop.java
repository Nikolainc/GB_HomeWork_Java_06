package Class;

import Enum.ProductType;
import Enum.Unit;
import Enum.Color;
import Enum.OS;
import Enum.Brand;

public class Laptop extends Product {

    private Brand _brand;
    private Color _color;
    private int _screenSize;
    private int _memoryMain;
    private int _memoryRAM;
    private OS _operationSystem;
    private long _serizal;

    @Override
    public String toString() {

        return String.format(
                "\nName: %s\nBrand: %s\nSKU: %s\nColor: %s\nOS: %s\nMemory: %s GB\nRAM: %s MB\nScreen: %s inch\nSerial: %s\nPrice: %s RUB\nType: %s\nUnit: %s\n",
                _name, _brand,_SKU, _color, _operationSystem, _memoryMain, _memoryRAM, _screenSize, _serizal, _price, _type,
                _unit);

    }

    public Laptop(String name,int SKU, float price, Color color, Brand brand,
        OS system, int screen, int memory, int RAM) {

        super(name, SKU, price, ProductType.good, Unit.piece);
        this._color = color;
        this._brand = brand;
        this._operationSystem = system;
        this._screenSize = screen;
        this._memoryMain = memory;
        this._memoryRAM = RAM;
        this._serizal = SerialGUI.getSerialNumber();

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

    public OS getOS() {

        return _operationSystem;

    }

    public long getSerialNum() {

        return _serizal;

    }

    //#endregion

}