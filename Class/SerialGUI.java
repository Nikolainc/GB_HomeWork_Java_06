package Class;

public class SerialGUI {
    
    private static long _serialNumber = 923093421l;

    public static long getSerialNumber() {

        return _serialNumber += 1;

    }

}
