/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    int field_c;
    int field_e;
    static long[] field_b;
    int field_a;
    int field_d;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        if (param0 >= -87) {
          fm.clearSharedReferences((byte) 2);
        }
    }

    static {
        field_z = "fm.A(";
        field_b = new long[32];
    }
}
