/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_e;
    int field_d;
    static Sprite field_i;
    static String field_c;
    int field_a;
    static volatile int field_f;
    int field_b;
    int field_g;
    static Sprite[] field_h;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        field_e = null;
        field_i = null;
        field_c = null;
        field_h = null;
        if (param0 > -85) {
          field_h = (Sprite[]) null;
        }
    }

    static {
        field_z = "nl.A(";
        field_e = "ON";
        field_f = 0;
        field_c = null;
    }
}
