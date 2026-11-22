/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static IntrusiveDeque field_c;
    static String field_b;
    static int field_d;
    static int field_a;
    private static String field_z;

    public static void clearStaticReferences(int param0) {
        if (param0 != 640) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_z = "ob.A(";
        field_b = "Music ";
        field_d = 0;
        field_c = new IntrusiveDeque();
        field_a = 640;
    }
}
