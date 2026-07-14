/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_a;
    static double[][] field_c;
    static int[] field_d;
    static boolean field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != -14578) {
            field_c = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != -182) {
          field_c = null;
          return sm.a(param0, false, 10, true);
        } else {
          return sm.a(param0, false, 10, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new double[][]{new double[3], new double[6], new double[3], new double[3]};
        field_b = false;
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
