package test_java;


public enum Ch10Enum {
    NORTH("North"),
    EAST("East"),
    SOUTH("South"),
    WEST("West");
    
    private String displayValue;

    private Ch10Enum(String name) {
        this.displayValue = name;
    }

    public static String getDisplayValue(Ch10Enum msg) {
        return msg.displayValue;
        
    }

}