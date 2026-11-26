/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dga {
    static int[] field_b;
    static int field_a;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        field_b = null;
        if (param0 != -97) {
          dga.clearStaticReferences((byte) -55);
        }
    }

    static {
        field_z = "dga.A(";
        field_b = new int[4];
    }
}
