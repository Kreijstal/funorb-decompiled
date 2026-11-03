/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static DefaultWidgetRenderer field_e;
    static int[] field_a;
    static String[][] field_c;
    static int field_d;
    static int field_b;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
        field_c = (String[][]) null;
        field_e = null;
    }

    static {
        field_z = "gk.A(";
        field_d = 0;
    }
}
