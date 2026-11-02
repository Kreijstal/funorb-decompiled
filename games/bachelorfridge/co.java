/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static IndexedSprite[] field_b;
    static String[][] field_a;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          co.releaseStatics(false);
          field_a = (String[][]) null;
          field_b = null;
          return;
        }
        field_a = (String[][]) null;
        field_b = null;
    }

    static {
        field_z = "co.A(";
    }
}
