/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la implements ok {
    static String field_e;
    static int field_f;
    static boolean field_a;
    static vn field_b;
    static kc field_c;
    static int field_d;

    public static void a() {
        int var1 = -2;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param2 >= -22) {
          return;
        } else {
          L0: {
            if (!param1) {
              de.b();
              de.b();
              de.b();
              break L0;
            } else {
              de.e(0, 0, de.field_e, de.field_j, 0, 192);
              break L0;
            }
          }
          lm.a((byte) -29, param1);
          return;
        }
    }

    final static int[] b() {
        return new int[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Members";
        field_f = 0;
        field_b = new vn();
    }
}
