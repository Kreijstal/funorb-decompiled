/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vra {
    int field_c;
    int field_e;
    int field_a;
    int field_d;
    static wdb field_b;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        if (param0 != -66) {
          vra.clearSharedReferences((byte) -20);
        }
    }

    static {
        field_z = "vra.A(";
    }
}
