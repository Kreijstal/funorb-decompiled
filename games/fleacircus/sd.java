/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static bi field_e;
    static ni field_i;
    static dd field_c;
    static int field_a;
    static int field_f;
    static String field_b;
    static java.applet.Applet field_j;
    static volatile boolean field_g;
    static long field_h;
    static vc field_d;

    public static void a(int param0) {
        field_i = null;
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_j = null;
        if (param0 != 9330) {
            sd.a((byte) -123);
        }
    }

    final static void a(byte param0) {
        if (param0 != -63) {
            field_i = null;
        }
    }

    final static boolean a(ni param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param0.e(false);
        if (param1 != 16448) {
          return false;
        } else {
          L0: {
            if (-2 == (var2 ^ -1)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_i = new ni(256);
        field_g = true;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_d = new vc();
    }
}
