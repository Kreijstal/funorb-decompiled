/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static IntrusiveDeque field_b;
    static int field_a;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        int var1 = -4 % ((-4 - param0) / 51);
        field_b = null;
    }

    static {
        field_z = "wg.A(";
        field_b = new IntrusiveDeque();
    }
}
