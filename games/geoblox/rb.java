/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String field_a;
    static boolean field_c;
    static int field_b;
    static v field_d;

    final static bg a(int param0, int param1, rh param2, int param3, rh param4) {
        if (param1 == 0) {
          if (!mf.a(param0, param3, 107, param2)) {
            return null;
          } else {
            return lc.a(4520, param4.a(param3, -28153, param0));
          }
        } else {
          rb.a((byte) -35);
          if (!mf.a(param0, param3, 107, param2)) {
            return null;
          } else {
            return lc.a(4520, param4.a(param3, -28153, param0));
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        int var1 = -73 % ((-60 - param0) / 48);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel";
        field_d = null;
    }
}
