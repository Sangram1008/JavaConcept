package TypeCasting;

public class TypeCastingConcept {

    // UpCasting Variable
    int intValue = 100;
    long longValue = intValue;

    float floatValue = 10.5f;
    double doubleValue = floatValue;

    // DownCasting Variable
    long longValue1 = 10000l;
    int intValue1 = (int) longValue1;

    double doubleValue1 = 125.55;
    float floatValue1 = (float) doubleValue1;

    void upCastingExample() {
        System.out.println(STR."Converting the int --> long \{longValue}");
        System.out.println(STR."Converting the float --> double \{doubleValue}");
    }

    void downCasting() {
        System.out.println(STR."Converting the long --> int \{intValue1}");
        System.out.println(STR."Converting the double --> float \{floatValue1}");
    }

    public static void main(String[] args) {
        TypeCastingConcept tcc = new TypeCastingConcept();
        tcc.upCastingExample();
        tcc.downCasting();
    }

}

