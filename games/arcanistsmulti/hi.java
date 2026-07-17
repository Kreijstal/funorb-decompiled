/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static String field_c;
    static boolean field_a;
    static so field_h;
    static int[][] field_b;
    static int field_g;
    static int[] field_f;
    static long field_d;
    static StringBuilder field_e;

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        field_f = null;
        field_h = null;
    }

    final static void a(int param0, boolean param1) {
        Object var2 = null;
        if (param0 >= -45) {
          L0: {
            hi.a(23, true);
            var2 = null;
            if (param1) {
              var2 = (Object) (Object) new wd();
              break L0;
            } else {
              var2 = (Object) (Object) new rd();
              break L0;
            }
          }
          jk.a(-113, new v((qi) var2));
          return;
        } else {
          L1: {
            var2 = null;
            if (param1) {
              var2 = (Object) (Object) new wd();
              break L1;
            } else {
              var2 = (Object) (Object) new rd();
              break L1;
            }
          }
          jk.a(-113, new v((qi) var2));
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unpacking graphics";
        field_b = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_h = new so(1);
        field_f = new int[]{3, 4, 5};
        field_e = new StringBuilder(80);
    }
}
