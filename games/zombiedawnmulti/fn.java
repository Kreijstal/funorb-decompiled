/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends RuntimeException {
    static boolean field_b;
    String field_k;
    static cj field_h;
    static ja field_e;
    Throwable field_f;
    static String field_l;
    static int field_c;
    static String field_g;
    static String field_j;
    static int field_d;
    static int[] field_a;
    static int field_i;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != 26677) {
            return;
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_j = null;
        field_e = null;
        field_l = null;
    }

    final static uo a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        uo var6 = null;
        uo var6_ref = null;
        if (param3 <= 86) {
          return null;
        } else {
          L0: {
            var6 = (uo) (Object) ic.field_c.g(62);
            if (var6 != null) {
              break L0;
            } else {
              var6_ref = new uo();
              break L0;
            }
          }
          var6_ref.a(param4, param5, param1, param2, (byte) 14, param0);
          return var6_ref;
        }
    }

    fn(Throwable param0, String param1) {
        ((fn) this).field_f = param0;
        ((fn) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "fn.A(";
        field_e = new ja(640, 480);
        field_l = "Your game";
        field_g = "Please try changing the following settings:  ";
        field_c = 0;
        field_j = "Open new ways to victory.";
        field_a = new int[43];
    }
}
