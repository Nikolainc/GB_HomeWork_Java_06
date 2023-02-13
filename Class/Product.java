package Class;

import Enum.ProductType;
import Enum.UnitType;

public class Product {

    protected float _price;
    protected ProductType _type;
    protected UnitType _unit;
    protected String _name;
    protected int _SKU;

    @Override
    public String toString() {

        return String.format("= = = = = = = = =\nName: %s\nSKU: %s\nPrice: %s\nType: %s\nUnit: %s\n= = = = = = = = =", _name, 
                _SKU, _price, _type, _unit);

    }

    public Product(String name, int SKU, float price, ProductType type, UnitType unit) {

        _name = name;
        _SKU = SKU;
        _price = price;
        _type = type;
        _unit = unit;

    }

    public float getPrice() {

        return _price;

    }

    public ProductType getType() {

        return _type;

    }

    public UnitType getUnit() {

        return _unit;

    }

    public String getName() {

        return _name;

    }

    public int getSku() {

        return _SKU;
        
    }

}