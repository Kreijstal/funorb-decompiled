/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vib {
    int field_c;
    int field_d;
    static Sprite field_b;
    int field_a;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        int var1 = 110 % ((6 - param0) / 37);
        field_b = null;
    }

    static {
        field_z = "vib.A(";
    }
}
