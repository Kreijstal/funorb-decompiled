/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lba {
    static qia field_c;
    int field_a;
    int field_e;
    int field_d;
    int field_b;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        if (param0 >= -30) {
          lba.clearStaticReferences((byte) -112);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_z = "lba.A(";
        field_c = new qia();
    }
}
