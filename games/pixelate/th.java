/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_a;
    static tf field_b;

    final static String a(int param0, String param1) {
        int var2 = fb.a(wo.field_h, (byte) 119, rj.field_I);
        if (!(-2 != (var2 ^ -1))) {
            param1 = "<img=0>" + param1;
        }
        if (!(param0 != var2)) {
            param1 = "<img=1>" + param1;
        }
        return param1;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -94) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & param1;
        if (-4097 < param0) {
          L0: {
            if (-2049 <= param0) {
              stackOut_7_0 = -k.field_i[-2048 + param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = k.field_i[2048 - param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 < (param0 ^ -1)) {
              stackOut_3_0 = -k.field_i[-param0 + 6144];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = k.field_i[param0 - 6144];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static void a(int param0) {
        if (param0 != 8191) {
          th.a(17);
          gf.a(pm.field_s, true, 32, nk.field_b);
          ke.field_d = true;
          return;
        } else {
          gf.a(pm.field_s, true, 32, nk.field_b);
          ke.field_d = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Mouse over an icon for details";
    }
}
