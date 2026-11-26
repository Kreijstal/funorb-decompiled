/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static IntrusiveDeque field_b;
    static int field_a;
    private static String field_z;

    public static void clearStaticReferences(int param0) {
        if (param0 != -28178) {
          od.clearStaticReferences(-38);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_z = "od.A(";
        field_b = new IntrusiveDeque();
    }
}
