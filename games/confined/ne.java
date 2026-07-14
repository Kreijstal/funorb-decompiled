/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static double field_c;
    static String field_a;
    static String field_d;
    static bi field_b;

    public static void a(byte param0) {
        int var1 = -40 / ((-70 - param0) / 52);
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        ce var2 = null;
        int var3 = 0;
        ce stackIn_8_0 = null;
        ce stackOut_7_0 = null;
        ce stackOut_6_0 = null;
        var3 = Confined.field_J ? 1 : 0;
        var1 = 0;
        if (param0 == -11) {
          L0: while (true) {
            if ((var1 ^ -1) <= -11) {
              return;
            } else {
              if (fb.field_d[var1] != null) {
                L1: {
                  if ((ih.field_a & 1 << var1) == 0) {
                    stackOut_7_0 = pn.field_a;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = vg.field_I;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                var2 = stackIn_8_0;
                var2.c(fb.field_d[var1], sc.field_d[var1], uh.field_g[var1] >> 836370724, 16777215, -1);
                var1++;
                continue L0;
              } else {
                var1++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = Math.atan2(1.0, 0.0);
        field_a = "Homing energy weapons";
        field_d = "Connection restored.";
    }
}
